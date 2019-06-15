SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for block
-- ----------------------------
DROP TABLE IF EXISTS `block`;
CREATE TABLE `block`
(
  `blockhash`  char(64) NOT NULL,
  `height`     int NOT NULL,
  `time`       datetime,
  `txSize`     smallint,
  `difficulty` double,
  `weight`     float,
   `merkleroot`     char(64),
  `output_total` char(64),
  `nextBlockHash` char(64),
  `prevBlockHash` char(64),
  PRIMARY KEY (`blockhash`),
  index `idx_blockhash` (`blockhash`),
  index `idx_height` (`height`),
  index `idx_time` (`time`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
