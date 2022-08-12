当你忘记mysql的密码时，请按一下步骤重置密码

1. cmd进入本地的mysql/bin文件目录
2. net stop mysql
3. mysqld --console --skip-grant-tables --shared-memory
4. 在之前的地方再打开一个cmd2
5. use mysql
6. update user set authentication_string='' where user='root';
7. quit;
8. 再开一个cmd3，还是同样的目录
9. net start mysql
10. mysql -u root -p 
11. 显示要输入密码时回车即可
12. ALTER USER 'root'@'localhost' IDENTIFIED BY '123456'
13. 注意，如果报错，说明root不在localhost，按14操作
14. use mysql;
15. select user, host from user;
16. 找到root对应的host的值，替换掉12里的localhost即可
