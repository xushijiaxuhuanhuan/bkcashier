package com.clare.bkcashier.service;

import com.alibaba.smart.framework.engine.SmartEngine;
import com.alibaba.smart.framework.engine.configuration.ProcessEngineConfiguration;
import com.alibaba.smart.framework.engine.configuration.impl.DefaultProcessEngineConfiguration;
import com.alibaba.smart.framework.engine.configuration.impl.DefaultSmartEngine;
import com.alibaba.smart.framework.engine.extension.scanner.SimpleAnnotationScanner;
import com.alibaba.smart.framework.engine.persister.custom.session.PersisterSession;
import com.alibaba.smart.framework.engine.service.command.ExecutionCommandService;
import com.alibaba.smart.framework.engine.service.command.ProcessCommandService;
import com.alibaba.smart.framework.engine.service.command.RepositoryCommandService;
import com.alibaba.smart.framework.engine.service.query.ExecutionQueryService;
import com.alibaba.smart.framework.engine.service.query.ProcessQueryService;
import com.alibaba.smart.framework.engine.service.query.RepositoryQueryService;




public class AbstractbkcashierService {

    public AbstractbkcashierService(){}

    protected ProcessEngineConfiguration processEngineConfiguration = new DefaultProcessEngineConfiguration();

    protected SmartEngine smartEngine = new DefaultSmartEngine();

    protected RepositoryCommandService repositoryCommandService;
    protected ProcessCommandService processCommandService;
    protected ProcessQueryService processQueryService;

    protected ExecutionQueryService executionQueryService;
    protected ExecutionCommandService executionCommandService;
    protected RepositoryQueryService repositoryQueryService ;

    private SimpleAnnotationScanner simpleAnnotationScanner ;

    protected  void setUp() {
        this.simpleAnnotationScanner = new SimpleAnnotationScanner(SmartEngine.class.getPackage().getName());


        PersisterSession.create();


        initProcessConfiguation();

        smartEngine = new DefaultSmartEngine();
        smartEngine.init(processEngineConfiguration);

        repositoryCommandService = smartEngine
                .getRepositoryCommandService();
        repositoryQueryService = smartEngine
                .getRepositoryQueryService();

        processCommandService = smartEngine.getProcessCommandService();
        processQueryService = smartEngine.getProcessQueryService();
        executionQueryService = smartEngine.getExecutionQueryService();
        executionCommandService = smartEngine.getExecutionCommandService();
    }

    protected void initProcessConfiguation() {
        processEngineConfiguration = new DefaultProcessEngineConfiguration();
    }

    protected  void clear() {
        PersisterSession.destroySession();
        simpleAnnotationScanner.clear();
    }

    protected void execute() {
    }

}
