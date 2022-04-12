package com.nureddinelmas.hiltkotlinexample

import android.app.Application
import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Qualifier
import javax.inject.Singleton


interface MyInterface {
    fun myprint() : String
}

/*
@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule{

    @ActivityScoped
    @Binds
    abstract fun bindingFunction(interfaceImp: InterfaceImp) : MyInterface
}
 */




@Module
@InstallIn(ActivityComponent::class)
class MyModule {

    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunction() : MyInterface {
        return InterfaceImp()
    }

    @SecondImplementor
    @Singleton
    @Provides
    fun secondProviderFunction() : MyInterface{
        return SecondInterfaceImplementor()
    }

    @Singleton
    @Provides
    fun gsonProvider() : Gson{
        return Gson()
    }
}


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class  FirstImplementor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class  SecondImplementor