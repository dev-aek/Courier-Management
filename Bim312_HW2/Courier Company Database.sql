-- MySQL Script generated by MySQL Workbench
-- Sun May  1 22:22:27 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Customer` (
  `CusID` INT NOT NULL,
  `CusName` VARCHAR(45) NOT NULL,
  `CusPhone` INT NOT NULL,
  `CusMail` VARCHAR(45) NOT NULL,
  `CusAdress` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`CusID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Company`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Company` (
  `ComID` INT NOT NULL,
  `ComName` VARCHAR(45) NOT NULL,
  `ComMail` VARCHAR(45) NOT NULL,
  `ComPhone` INT NOT NULL,
  PRIMARY KEY (`ComID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Delivery`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Delivery` (
  `DelID` INT NOT NULL,
  `DelDesc` VARCHAR(45) NOT NULL,
  `DelDate` DATE NOT NULL,
  `DelAdress` VARCHAR(45) NOT NULL,
  `Customer_id` INT NOT NULL,
  `Company_ComID` INT NOT NULL,
  PRIMARY KEY (`DelID`, `Customer_id`, `Company_ComID`),
  INDEX `fk_Delivery_Customer_idx` (`Customer_id` ASC) VISIBLE,
  INDEX `fk_Delivery_Company1_idx` (`Company_ComID` ASC) VISIBLE,
  CONSTRAINT `fk_Delivery_Customer`
    FOREIGN KEY (`Customer_id`)
    REFERENCES `mydb`.`Customer` (`CusID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Delivery_Company1`
    FOREIGN KEY (`Company_ComID`)
    REFERENCES `mydb`.`Company` (`ComID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Payment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Payment` (
  `PayReptNo` INT NOT NULL,
  `PayAmaount` VARCHAR(45) NOT NULL,
  `PayDate` DATE NOT NULL,
  `Customer_id` INT NOT NULL,
  `Delivery_id` INT NOT NULL,
  PRIMARY KEY (`PayReptNo`, `Customer_id`),
  INDEX `fk_Payment_Customer1_idx` (`Customer_id` ASC) VISIBLE,
  INDEX `fk_Payment_Delivery1_idx` (`Delivery_id` ASC) VISIBLE,
  CONSTRAINT `fk_Payment_Customer1`
    FOREIGN KEY (`Customer_id`)
    REFERENCES `mydb`.`Customer` (`CusID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Payment_Delivery1`
    FOREIGN KEY (`Delivery_id`)
    REFERENCES `mydb`.`Delivery` (`DelID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Courier`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Courier` (
  `CourID` INT NOT NULL,
  `CourType` VARCHAR(45) NOT NULL,
  `CourDriverLN` VARCHAR(45) NOT NULL,
  `Couriercol` VARCHAR(45) NOT NULL,
  `Delivery_DelID` INT NOT NULL,
  `Company_ComID` INT NOT NULL,
  PRIMARY KEY (`CourID`, `Company_ComID`),
  INDEX `fk_Courier_Delivery1_idx` (`Delivery_DelID` ASC) VISIBLE,
  INDEX `fk_Courier_Company1_idx` (`Company_ComID` ASC) VISIBLE,
  CONSTRAINT `fk_Courier_Delivery1`
    FOREIGN KEY (`Delivery_DelID`)
    REFERENCES `mydb`.`Delivery` (`DelID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Courier_Company1`
    FOREIGN KEY (`Company_ComID`)
    REFERENCES `mydb`.`Company` (`ComID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;




SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


