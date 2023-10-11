package io.explains.myonlymood.controller;

import io.explains.myonlymood.controller.abstractImpl.RestrictCrudController;
import io.explains.myonlymood.dto.UserAccountDTO;
import io.explains.myonlymood.model.UserAccount;
import io.explains.myonlymood.service.CRUD.IRestrictCrudService;
import io.explains.myonlymood.service.CRUD.IUserCrud;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserCrontroller extends RestrictCrudController<UserAccount, UserAccountDTO,Long> {

    private final IUserCrud service;

    private final ModelMapper modelMapper;

    public UserCrontroller(IUserCrud service, ModelMapper modelMapper) {
        super(UserAccount.class, UserAccountDTO.class);
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @Override
    protected IRestrictCrudService<UserAccount, Long> getService() {
        return service;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }

}
