
    alter table `accounting_record` 
       drop 
       foreign key `FK41jm4vk7runvmg5tderffrele`;

    alter table `accounting_record` 
       drop 
       foreign key `FKk1pmfnppwk0kav7xloy8u71uq`;

    alter table `administrator` 
       drop 
       foreign key FK_2a5vcjo3stlfcwadosjfq49l1;

    alter table `anonymous` 
       drop 
       foreign key FK_6lnbc6fo3om54vugoh8icg78m;

    alter table `application` 
       drop 
       foreign key `FKp6hc01e2bc6ly2q8rv4b7ubro`;

    alter table `application` 
       drop 
       foreign key `FKk5ibe41quxsif8im882xv4afo`;

    alter table `application` 
       drop 
       foreign key `FKl4fp0cd8c008ma79n6w58xhk9`;

    alter table `authenticated` 
       drop 
       foreign key FK_h52w0f3wjoi68b63wv9vwon57;

    alter table `banner` 
       drop 
       foreign key `FKr19baq0bri0akndc7ruwhngy4`;

    alter table `banner` 
       drop 
       foreign key `FKdocr1jjfgwx9ef5jbf675l360`;

    alter table `book_keeper_request` 
       drop 
       foreign key `FK5ix9bq8a7nw05wh16k3cua620`;

    alter table `bookkeeper` 
       drop 
       foreign key FK_krvjp9eaqyapewl2igugbo9o8;

    alter table `credit_card` 
       drop 
       foreign key `FK31e9eqi896koc93q7yjs5yoox`;

    alter table `credit_card_for_patron` 
       drop 
       foreign key `FKt4r2xk2tub96vxanpfvkfitmc`;

    alter table `dormit` 
       drop 
       foreign key `FK67c3f7g9dv0sxvy5d2e7kt7au`;

    alter table `entrepreneur` 
       drop 
       foreign key FK_r6tqltqvrlh1cyy8rsj5pev1q;

    alter table `forum` 
       drop 
       foreign key `FKq8ggcjgl5by5gf6l5bji632hu`;

    alter table `investment_round` 
       drop 
       foreign key `FKkj1l8c2ftn9c65y061me6t37j`;

    alter table `investor` 
       drop 
       foreign key FK_dcek5rr514s3rww0yy57vvnpq;

    alter table `message` 
       drop 
       foreign key `FKfwwpivgx5j4vw4594dgrw884q`;

    alter table `message` 
       drop 
       foreign key `FKik4epe9dp5q6uenarfyia7xin`;

    alter table `patron` 
       drop 
       foreign key `FKf1ihd7188521w9d7dda78s8xj`;

    alter table `patron` 
       drop 
       foreign key FK_8xx5nujhuio3advxc2freyu65;

    alter table `work_programme` 
       drop 
       foreign key `FK3nxyaik1cnvfdg02p9a8ibiko`;

    drop table if exists `accounting_record`;

    drop table if exists `administrator`;

    drop table if exists `anonymous`;

    drop table if exists `application`;

    drop table if exists `authenticated`;

    drop table if exists `banner`;

    drop table if exists `book_keeper_request`;

    drop table if exists `bookkeeper`;

    drop table if exists `challenge`;

    drop table if exists `credit_card`;

    drop table if exists `credit_card_for_patron`;

    drop table if exists `customisation`;

    drop table if exists `donaire_bulletin`;

    drop table if exists `dormit`;

    drop table if exists `entrepreneur`;

    drop table if exists `fernandez_bulletin`;

    drop table if exists `forum`;

    drop table if exists `gonzalez_bulletin`;

    drop table if exists `inquirie`;

    drop table if exists `investment_round`;

    drop table if exists `investor`;

    drop table if exists `jimenez_bulletin`;

    drop table if exists `marin_bulletin`;

    drop table if exists `message`;

    drop table if exists `notice`;

    drop table if exists `overture`;

    drop table if exists `patron`;

    drop table if exists `technology`;

    drop table if exists `tool_record`;

    drop table if exists `user_account`;

    drop table if exists `work_programme`;

    drop table if exists `hibernate_sequence`;
