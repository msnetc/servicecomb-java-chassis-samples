package cn.medsci.paas.demo.service.impl;

import cn.medsci.paas.demo.entity.User;
import cn.medsci.paas.demo.mapper.UserMapper;
import cn.medsci.paas.demo.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2019-03-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
