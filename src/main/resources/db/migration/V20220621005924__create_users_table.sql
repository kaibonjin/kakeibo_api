create table users (
    id int not null auto_increment comment 'ユーザーID',
    name varchar(100) not null comment '名前',
    email varchar(100) not null comment 'メールアドレス',
    password varchar(100) not null comment '日付',
    created_at datetime not null DEFAULT CURRENT_TIMESTAMP comment '作成日時',
    updated_at datetime not null DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新日時',
    primary key (id)
) engine=innodb default charset=utf8mb4 comment='ユーザーテーブル';