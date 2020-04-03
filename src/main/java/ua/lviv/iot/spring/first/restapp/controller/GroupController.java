package ua.lviv.iot.spring.first.restapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.first.business.GroupService;
import ua.lviv.iot.spring.first.restapp.model.Group;



@RequestMapping("/groups")
@RestController
public class GroupController {
  
  @Autowired
  private GroupService groupService;
  
  public List<Group> getAllGroups() {
      return null;
  }

}

