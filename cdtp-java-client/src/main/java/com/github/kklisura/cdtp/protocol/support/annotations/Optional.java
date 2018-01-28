package com.github.kklisura.cdtp.protocol.support.annotations;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Optional annotation.
 *
 * @author Kenan Klisura
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {FIELD, METHOD, PARAMETER, TYPE})
public @interface Optional {}
