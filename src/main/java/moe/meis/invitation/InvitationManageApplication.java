package moe.meis.invitation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("moe.meis.invitation.mapper")//将项目中对应的mapper类的路径加进来就可以了
public class InvitationManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvitationManageApplication.class, args);
	}
}
