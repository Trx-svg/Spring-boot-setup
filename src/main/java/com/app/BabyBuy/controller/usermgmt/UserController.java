package com.app.BabyBuy.controller.usermgmt;

import com.app.BabyBuy.constants.Message;
import com.app.BabyBuy.constants.MessageConstants;
import com.app.BabyBuy.constants.ModuleNameConstants;
import com.app.BabyBuy.generics.controller.BaseController;
import com.app.BabyBuy.model.usermgmt.User;
import com.app.BabyBuy.pojo.GlobalApiResponse;
import com.app.BabyBuy.service.usermgmt.UserService;
import enums.CRUD;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
@Tag(name = ModuleNameConstants.USER)
public class UserController extends BaseController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @Operation(summary = "Use this api to save/update food menu details", responses = {@ApiResponse(responseCode = "200",
            content = {@Content(array =
            @ArraySchema(schema = @Schema(implementation = Map.class)))}, description = "This api will save the details of Bank,Bank Type and Network")})
    public ResponseEntity<GlobalApiResponse> getFoodMenu(@RequestBody User requestPojo){
        userService.saveUser(requestPojo);
        return ResponseEntity.ok(successResponse(Message.crud(MessageConstants.SAVE, moduleName),
                CRUD.GET, true
        ));
    }
}
