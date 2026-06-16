package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import androidx.lifecycle.c1;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.protobuf.c6;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.NotificationPrimerSource;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.AddPodcastResult;
import io.elevenlabs.domain.services.NotificationPermissionService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.usecase.ShowImportingContentToast;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportFileViewModel$listen$1$1", f = "ImportFileScreen.kt", l = {114, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ImportFileViewModel$listen$1$1 extends yn.i implements ho.p {
    final /* synthetic */ ImportFileState $this_queueStateUpdate;
    int label;
    final /* synthetic */ ImportFileViewModel this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportFileViewModel$listen$1$1$4", f = "ImportFileScreen.kt", l = {165}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportFileViewModel$listen$1$1$4 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass4 extends yn.i implements ho.p {
        int label;
        final /* synthetic */ ImportFileViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ImportFileViewModel importFileViewModel, wn.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
            this.this$0 = importFileViewModel;
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass4(this.this$0, cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass4) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            NotificationPermissionService notificationPermissionService;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                notificationPermissionService = this.this$0.notificationPermissionService;
                NotificationPrimerSource notificationPrimerSource = NotificationPrimerSource.IMPORT;
                this.label = 1;
                Object requestPrimer = notificationPermissionService.requestPrimer(notificationPrimerSource, this);
                xn.a aVar = xn.a.f37986a;
                if (requestPrimer == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportFileViewModel$listen$1$1(ImportFileState importFileState, ImportFileViewModel importFileViewModel, wn.c<? super ImportFileViewModel$listen$1$1> cVar) {
        super(2, cVar);
        this.$this_queueStateUpdate = importFileState;
        this.this$0 = importFileViewModel;
    }

    public static final ImportFileState invokeSuspend$lambda$0(AddPodcastResult addPodcastResult, ImportFileState importFileState) {
        return ImportFileState.copy$default(importFileState, null, false, null, ((AddPodcastResult.Success) addPodcastResult).getMeta(), null, false, false, 117, null);
    }

    public static final ImportFileState invokeSuspend$lambda$1(AddPodcastResult addPodcastResult, ImportFileState importFileState) {
        return ImportFileState.copy$default(importFileState, null, false, null, null, ((AddPodcastResult.LimitReached) addPodcastResult).getData(), false, false, 109, null);
    }

    public static final ImportFileState invokeSuspend$lambda$2(ImportFileViewModel importFileViewModel, AsyncCallResult asyncCallResult, ImportFileState importFileState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = importFileViewModel.resolveErrorMessageUseCase;
        return ImportFileState.copy$default(importFileState, null, false, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, null, false, false, 121, null);
    }

    public static final ImportFileState invokeSuspend$lambda$3(ImportFileViewModel importFileViewModel, AsyncCallResult asyncCallResult, ImportFileState importFileState) {
        jl.a aVar;
        aVar = importFileViewModel.showImportingContentToast;
        AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
        ((ShowImportingContentToast) aVar.get()).invoke(importFileState.isPodcastMode(), (ReadMeta) success.getData());
        return ImportFileState.copy$default(importFileState, null, false, null, (ReadMeta) success.getData(), null, false, false, 117, null);
    }

    public static final ImportFileState invokeSuspend$lambda$4(ImportFileViewModel importFileViewModel, AsyncCallResult asyncCallResult, ImportFileState importFileState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = importFileViewModel.resolveErrorMessageUseCase;
        return ImportFileState.copy$default(importFileState, null, false, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, null, false, false, 121, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ImportFileViewModel$listen$1$1(this.$this_queueStateUpdate, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ImportFileViewModel$listen$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0045, code lost:
    
        if (r8 == r4) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c4, code lost:
    
        if (r8 == r4) goto L75;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        String str;
        Logger logger2;
        String str2;
        Logger logger3;
        String str3;
        Logger logger4;
        String str4;
        DispatcherFactory dispatcherFactory;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
                    if (asyncCallResult instanceof AsyncCallResult.Success) {
                        s7.a h10 = c1.h(this.this$0);
                        dispatcherFactory = this.this$0.getDispatcherFactory();
                        fr.g0.D(h10, dispatcherFactory.getDefault(), null, new AnonymousClass4(this.this$0, null), 2);
                        ImportFileViewModel importFileViewModel = this.this$0;
                        importFileViewModel.queueStateUpdate(new h(importFileViewModel, (AsyncCallResult.Success) asyncCallResult, 1));
                    } else if (asyncCallResult instanceof AsyncCallResult.Error) {
                        logger4 = this.this$0.logger;
                        str4 = this.this$0.tag;
                        logger4.log(str4, "Error importing a file");
                        final ImportFileViewModel importFileViewModel2 = this.this$0;
                        final AsyncCallResult.Error error = (AsyncCallResult.Error) asyncCallResult;
                        final int i11 = 1;
                        importFileViewModel2.queueStateUpdate(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.b0
                            @Override // ho.l
                            public final Object invoke(Object obj2) {
                                ImportFileState invokeSuspend$lambda$2;
                                ImportFileState invokeSuspend$lambda$4;
                                switch (i11) {
                                    case 0:
                                        invokeSuspend$lambda$2 = ImportFileViewModel$listen$1$1.invokeSuspend$lambda$2(importFileViewModel2, error, (ImportFileState) obj2);
                                        return invokeSuspend$lambda$2;
                                    default:
                                        invokeSuspend$lambda$4 = ImportFileViewModel$listen$1$1.invokeSuspend$lambda$4(importFileViewModel2, error, (ImportFileState) obj2);
                                        return invokeSuspend$lambda$4;
                                }
                            }
                        });
                    } else {
                        c6.p();
                        return null;
                    }
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                AsyncCallResult asyncCallResult2 = (AsyncCallResult) obj;
                if (asyncCallResult2 instanceof AsyncCallResult.Success) {
                    AddPodcastResult addPodcastResult = (AddPodcastResult) ((AsyncCallResult.Success) asyncCallResult2).getData();
                    if (addPodcastResult instanceof AddPodcastResult.Success) {
                        this.this$0.queueStateUpdate(new z((AddPodcastResult.Success) addPodcastResult, 0));
                    } else if (addPodcastResult instanceof AddPodcastResult.LimitReached) {
                        this.this$0.queueStateUpdate(new a0((AddPodcastResult.LimitReached) addPodcastResult, 0));
                    } else {
                        c6.p();
                        return null;
                    }
                } else if (asyncCallResult2 instanceof AsyncCallResult.Error) {
                    logger3 = this.this$0.logger;
                    str3 = this.this$0.tag;
                    logger3.log(str3, "Error importing a podcast file");
                    final ImportFileViewModel importFileViewModel3 = this.this$0;
                    final AsyncCallResult.Error error2 = (AsyncCallResult.Error) asyncCallResult2;
                    final int i12 = 0;
                    importFileViewModel3.queueStateUpdate(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.b0
                        @Override // ho.l
                        public final Object invoke(Object obj2) {
                            ImportFileState invokeSuspend$lambda$2;
                            ImportFileState invokeSuspend$lambda$4;
                            switch (i12) {
                                case 0:
                                    invokeSuspend$lambda$2 = ImportFileViewModel$listen$1$1.invokeSuspend$lambda$2(importFileViewModel3, error2, (ImportFileState) obj2);
                                    return invokeSuspend$lambda$2;
                                default:
                                    invokeSuspend$lambda$4 = ImportFileViewModel$listen$1$1.invokeSuspend$lambda$4(importFileViewModel3, error2, (ImportFileState) obj2);
                                    return invokeSuspend$lambda$4;
                            }
                        }
                    });
                } else {
                    c6.p();
                    return null;
                }
            }
        } else {
            sn.a.g(obj);
            boolean isPodcastMode = this.$this_queueStateUpdate.isPodcastMode();
            ImportFileViewModel importFileViewModel4 = this.this$0;
            xn.a aVar = xn.a.f37986a;
            if (isPodcastMode) {
                logger2 = importFileViewModel4.logger;
                str2 = this.this$0.tag;
                ImportFileViewModel$listen$1$1$result$1 importFileViewModel$listen$1$1$result$1 = new ImportFileViewModel$listen$1$1$result$1(this.this$0, this.$this_queueStateUpdate, null);
                this.label = 1;
                obj = logger2.logAsyncCallTransaction(str2, "addPodcast-file", importFileViewModel$listen$1$1$result$1, this);
            } else {
                logger = importFileViewModel4.logger;
                str = this.this$0.tag;
                ImportFileViewModel$listen$1$1$result$2 importFileViewModel$listen$1$1$result$2 = new ImportFileViewModel$listen$1$1$result$2(this.this$0, this.$this_queueStateUpdate, null);
                this.label = 2;
                obj = logger.logAsyncCallTransaction(str, "addUpload-file", importFileViewModel$listen$1$1$result$2, this);
            }
            return aVar;
        }
        return sn.z.f31622a;
    }
}
