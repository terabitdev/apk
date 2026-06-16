package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.AddPodcastResult;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.usecase.ShowImportingContentToast;
import java.io.File;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportLinkViewModel$onParsingCompleted$1$1", f = "ImportLinkScreen.kt", l = {140, 181}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ImportLinkViewModel$onParsingCompleted$1$1 extends yn.i implements ho.p {
    final /* synthetic */ String $html;
    final /* synthetic */ ImportLinkState $this_queueStateUpdate;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ImportLinkViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportLinkViewModel$onParsingCompleted$1$1(ImportLinkViewModel importLinkViewModel, String str, ImportLinkState importLinkState, wn.c<? super ImportLinkViewModel$onParsingCompleted$1$1> cVar) {
        super(2, cVar);
        this.this$0 = importLinkViewModel;
        this.$html = str;
        this.$this_queueStateUpdate = importLinkState;
    }

    public static final ImportLinkState invokeSuspend$lambda$1(AddPodcastResult addPodcastResult, ImportLinkState importLinkState) {
        return ImportLinkState.copy$default(importLinkState, false, null, ((AddPodcastResult.Success) addPodcastResult).getMeta(), null, null, false, false, false, 250, null);
    }

    public static final ImportLinkState invokeSuspend$lambda$2(AddPodcastResult addPodcastResult, ImportLinkState importLinkState) {
        return ImportLinkState.copy$default(importLinkState, false, null, null, ((AddPodcastResult.LimitReached) addPodcastResult).getData(), null, false, false, false, 246, null);
    }

    public static final ImportLinkState invokeSuspend$lambda$3(ImportLinkViewModel importLinkViewModel, AsyncCallResult asyncCallResult, ImportLinkState importLinkState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = importLinkViewModel.resolveErrorMessageUseCase;
        return ImportLinkState.copy$default(importLinkState, false, null, null, null, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), false, false, false, 238, null);
    }

    public static final ImportLinkState invokeSuspend$lambda$4(ImportLinkViewModel importLinkViewModel, AsyncCallResult asyncCallResult, ImportLinkState importLinkState) {
        jl.a aVar;
        aVar = importLinkViewModel.showImportingContentToast;
        AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
        ((ShowImportingContentToast) aVar.get()).invoke(importLinkState.isPodcastMode(), (ReadMeta) success.getData());
        return ImportLinkState.copy$default(importLinkState, false, null, (ReadMeta) success.getData(), null, null, false, false, false, 250, null);
    }

    public static final ImportLinkState invokeSuspend$lambda$5(ImportLinkViewModel importLinkViewModel, AsyncCallResult asyncCallResult, ImportLinkState importLinkState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = importLinkViewModel.resolveErrorMessageUseCase;
        return ImportLinkState.copy$default(importLinkState, false, null, null, null, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), false, false, false, 238, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ImportLinkViewModel$onParsingCompleted$1$1(this.this$0, this.$html, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ImportLinkViewModel$onParsingCompleted$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (r9 == r5) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0101, code lost:
    
        if (r9 == r5) goto L75;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FileService fileService;
        File createTempFile;
        Logger logger;
        String str;
        Logger logger2;
        String str2;
        Logger logger3;
        String str3;
        Logger logger4;
        String str4;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    createTempFile = (File) this.L$1;
                    sn.a.g(obj);
                    AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
                    if (asyncCallResult instanceof AsyncCallResult.Success) {
                        ImportLinkViewModel importLinkViewModel = this.this$0;
                        importLinkViewModel.queueStateUpdate(new h(importLinkViewModel, (AsyncCallResult.Success) asyncCallResult, 2));
                    } else if (asyncCallResult instanceof AsyncCallResult.Error) {
                        logger4 = this.this$0.logger;
                        str4 = this.this$0.tag;
                        logger4.log(str4, "Error saving upload content");
                        final ImportLinkViewModel importLinkViewModel2 = this.this$0;
                        final AsyncCallResult.Error error = (AsyncCallResult.Error) asyncCallResult;
                        final int i11 = 1;
                        importLinkViewModel2.queueStateUpdate(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.g0
                            @Override // ho.l
                            public final Object invoke(Object obj2) {
                                ImportLinkState invokeSuspend$lambda$3;
                                ImportLinkState invokeSuspend$lambda$5;
                                switch (i11) {
                                    case 0:
                                        invokeSuspend$lambda$3 = ImportLinkViewModel$onParsingCompleted$1$1.invokeSuspend$lambda$3(importLinkViewModel2, error, (ImportLinkState) obj2);
                                        return invokeSuspend$lambda$3;
                                    default:
                                        invokeSuspend$lambda$5 = ImportLinkViewModel$onParsingCompleted$1$1.invokeSuspend$lambda$5(importLinkViewModel2, error, (ImportLinkState) obj2);
                                        return invokeSuspend$lambda$5;
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
                createTempFile = (File) this.L$1;
                sn.a.g(obj);
                AsyncCallResult asyncCallResult2 = (AsyncCallResult) obj;
                if (asyncCallResult2 instanceof AsyncCallResult.Success) {
                    AddPodcastResult addPodcastResult = (AddPodcastResult) ((AsyncCallResult.Success) asyncCallResult2).getData();
                    if (addPodcastResult instanceof AddPodcastResult.Success) {
                        this.this$0.queueStateUpdate(new z((AddPodcastResult.Success) addPodcastResult, 1));
                    } else if (addPodcastResult instanceof AddPodcastResult.LimitReached) {
                        this.this$0.queueStateUpdate(new a0((AddPodcastResult.LimitReached) addPodcastResult, 1));
                    } else {
                        c6.p();
                        return null;
                    }
                } else if (asyncCallResult2 instanceof AsyncCallResult.Error) {
                    logger3 = this.this$0.logger;
                    str3 = this.this$0.tag;
                    logger3.log(str3, "Error saving podcast content");
                    final ImportLinkViewModel importLinkViewModel3 = this.this$0;
                    final AsyncCallResult.Error error2 = (AsyncCallResult.Error) asyncCallResult2;
                    final int i12 = 0;
                    importLinkViewModel3.queueStateUpdate(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.g0
                        @Override // ho.l
                        public final Object invoke(Object obj2) {
                            ImportLinkState invokeSuspend$lambda$3;
                            ImportLinkState invokeSuspend$lambda$5;
                            switch (i12) {
                                case 0:
                                    invokeSuspend$lambda$3 = ImportLinkViewModel$onParsingCompleted$1$1.invokeSuspend$lambda$3(importLinkViewModel3, error2, (ImportLinkState) obj2);
                                    return invokeSuspend$lambda$3;
                                default:
                                    invokeSuspend$lambda$5 = ImportLinkViewModel$onParsingCompleted$1$1.invokeSuspend$lambda$5(importLinkViewModel3, error2, (ImportLinkState) obj2);
                                    return invokeSuspend$lambda$5;
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
            fileService = this.this$0.fileService;
            File file = new File(fileService.getCacheDirectory(), "uploads");
            file.mkdirs();
            createTempFile = File.createTempFile(FirebaseAnalytics.Param.CONTENT, ".html", file);
            createTempFile.getClass();
            eo.k.n0(createTempFile, this.$html);
            boolean isPodcastMode = this.$this_queueStateUpdate.isPodcastMode();
            ImportLinkViewModel importLinkViewModel4 = this.this$0;
            xn.a aVar = xn.a.f37986a;
            if (isPodcastMode) {
                logger2 = importLinkViewModel4.logger;
                str2 = this.this$0.tag;
                ImportLinkViewModel$onParsingCompleted$1$1$result$1 importLinkViewModel$onParsingCompleted$1$1$result$1 = new ImportLinkViewModel$onParsingCompleted$1$1$result$1(this.this$0, createTempFile, this.$this_queueStateUpdate, null);
                this.L$0 = null;
                this.L$1 = createTempFile;
                this.label = 1;
                obj = logger2.logAsyncCallTransaction(str2, "addPodcast-website", importLinkViewModel$onParsingCompleted$1$1$result$1, this);
            } else {
                logger = importLinkViewModel4.logger;
                str = this.this$0.tag;
                ImportLinkViewModel$onParsingCompleted$1$1$result$2 importLinkViewModel$onParsingCompleted$1$1$result$2 = new ImportLinkViewModel$onParsingCompleted$1$1$result$2(this.this$0, createTempFile, this.$this_queueStateUpdate, null);
                this.L$0 = null;
                this.L$1 = createTempFile;
                this.label = 2;
                obj = logger.logAsyncCallTransaction(str, "addUpload-website", importLinkViewModel$onParsingCompleted$1$1$result$2, this);
            }
            return aVar;
        }
        createTempFile.delete();
        return sn.z.f31622a;
    }
}
