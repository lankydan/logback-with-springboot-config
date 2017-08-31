package com.lankydan.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

  private static final Logger LOGGER = LoggerFactory.getLogger(MyServiceImpl.class);

  @Override
  public void doStuff(final String value) {
    LOGGER.trace("doStuff needed more information - {}", value);
    LOGGER.debug("doStuff needed to debug - {}", value);
    LOGGER.info("doStuff took input - {}", value);
    LOGGER.warn("doStuff needed to warn - {}", value);
    LOGGER.error("doStuff encountered an error with value - {}", value);
  }
}
