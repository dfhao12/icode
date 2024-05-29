DROP TABLE IF EXISTS `user_t`;
CREATE TABLE `user_t`
(
    `id`        int UNSIGNED NOT NULL COMMENT '主键',
    `user_name` varchar(64) NULL COMMENT '用户名',
    `password`  varchar(64) NULL COMMENT '密码',
    PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `auth_t`;
CREATE TABLE `auth_t`
(
    `id`        int UNSIGNED NOT NULL COMMENT '主键',
    `user_id`   varchar(64) NULL COMMENT '用户名',
    `auth_info` varchar(64) NULL COMMENT '密码',
    PRIMARY KEY (`id`)
);