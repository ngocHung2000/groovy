package com.devops.vn

import com.devops.vn.controllers.SumDef
import com.devops.vn.models.GitSCM

GitSCM git = new GitSCM();
git.setGitURL("HTTPS");
git.setToken("123");
git.setBranch("master");

println "${git.getBranch()}"
println "${git.getToken()}"
println "${git.getGitURL()}"



SumDef sumDef = new SumDef();
println sumDef.sum(2, 3);