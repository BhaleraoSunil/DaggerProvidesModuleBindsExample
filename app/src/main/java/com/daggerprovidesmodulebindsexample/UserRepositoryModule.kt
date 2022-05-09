package com.daggerprovidesmodulebindsexample


import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {

    //way 1
  /*  @Provides
    fun getFirebaseRepository():UserRepository{
        return FirebaseRepository()
    }*/

    /*
    * If we provide UserRepository dependency using multiple ways then dagger generates error like:
    * error: [Dagger/DuplicateBindings] com.daggerprovidesmodulebindsexample.UserRepository is bound multiple times
    * So we need to either provide only one type binding  dependency or need to use named annotations.
    * For now we only use one  type binding & will comment above
    * */

    //way 2
    @Provides
    fun getSQLRepository(sqlRepository: SQLRepository):UserRepository{
        return sqlRepository
    }
}