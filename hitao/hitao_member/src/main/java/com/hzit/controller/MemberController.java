package com.hzit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hzit.mapper.MemberMapper;
import com.hzit.service.MemberService;
import com.netflix.discovery.converters.Auto;

@Controller
public class MemberController {
@Autowired
MemberService memberService;

}
