create table expenses (
    id int not null auto_increment comment '支出ID',
    user_id int not null comment 'ユーザーID',
    amount int not null comment '支出',
    memo varchar(100) comment 'メモ',
    date date not null comment '日付',
    created_at datetime not null DEFAULT CURRENT_TIMESTAMP comment '作成日時',
    updated_at datetime not null DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '更新日時',
    primary key (id),
    foreign key (user_id) references users(id)
)engine=innodb default charset=utf8mb4 comment='支出テーブル';