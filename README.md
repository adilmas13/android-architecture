# Android MVVM Architecture (No Dependency injection library)

Consist of three main layer (3 Project modules with dependency between them)
- Presentation - UI (Activity, Fragment, ViewModel, ViewModelFactory)
- Domain (Usecase)
- Data - Data source (Rest API, Local DB)

Architecture has no dependency injection library. All injections between layers are done manually using 'inversion of control' concept
Reference : https://antonioleiva.com/clean-architecture-android/

Dependencies in Use
- LiveData + ViewModel
- Coroutines
- Gson (to be removed) + Kotlinx serialization (Json Serialization Deserialization)
- Retrofit (Rest API Library)
- Coil (Image Loader)

Add On
- ktlint is integrated to maintain kotlin coding standards
