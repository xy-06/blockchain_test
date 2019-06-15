SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tx_detall
-- ----------------------------
DROP TABLE IF EXISTS `tx_detall`;
CREATE TABLE `tx_detall`
(
  `txid` bigint NOT NULL auto_increment,
  `adress`  varchar(100),
  `amount`   double,
  `isRemove`     varchar(100),
  `hash`   char(64),
  PRIMARY KEY (`txid`),
  index `idx_adress` (`adress`),
  index `idx_txhash` (`hash`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
