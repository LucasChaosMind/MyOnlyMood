package io.explains.myonlymood.controller;

import io.explains.myonlymood.controller.abstractImpl.RestrictCrudController;
import io.explains.myonlymood.dto.ActivesDTO;
import io.explains.myonlymood.dto.BankActiveCategoryDTO;
import io.explains.myonlymood.model.Actives;
import io.explains.myonlymood.model.BankActiveCategory;
import io.explains.myonlymood.service.CRUD.IActivesCrud;
import io.explains.myonlymood.service.CRUD.IRestrictCrudService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Actives")
public class ActivesController extends RestrictCrudController<Actives, ActivesDTO,Long> {

    private final IActivesCrud service;

    private final ModelMapper modelMapper;

    public ActivesController(IActivesCrud service, ModelMapper modelMapper) {
        super(Actives.class, ActivesDTO.class);
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @Override
    protected IRestrictCrudService<Actives, Long> getService() {
        return service;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return modelMapper;
    }

}
