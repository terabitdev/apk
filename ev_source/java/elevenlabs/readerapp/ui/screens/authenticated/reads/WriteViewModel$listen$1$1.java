package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.FileData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.AddPodcastResult;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.usecase.ShowImportingContentToast;
import java.io.File;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.WriteViewModel$listen$1$1", f = "WriteScreen.kt", l = {97, 138}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class WriteViewModel$listen$1$1 extends yn.i implements ho.p {
    final /* synthetic */ WriteState $this_queueStateUpdate;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WriteViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteViewModel$listen$1$1(WriteViewModel writeViewModel, WriteState writeState, wn.c<? super WriteViewModel$listen$1$1> cVar) {
        super(2, cVar);
        this.this$0 = writeViewModel;
        this.$this_queueStateUpdate = writeState;
    }

    public static final WriteState invokeSuspend$lambda$1(AddPodcastResult addPodcastResult, WriteState writeState) {
        return WriteState.copy$default(writeState, false, null, ((AddPodcastResult.Success) addPodcastResult).getMeta(), null, false, false, false, 122, null);
    }

    public static final WriteState invokeSuspend$lambda$2(AddPodcastResult addPodcastResult, WriteState writeState) {
        return WriteState.copy$default(writeState, false, null, null, ((AddPodcastResult.LimitReached) addPodcastResult).getData(), false, false, false, 118, null);
    }

    public static final WriteState invokeSuspend$lambda$5(WriteViewModel writeViewModel, AsyncCallResult asyncCallResult, WriteState writeState) {
        jl.a aVar;
        aVar = writeViewModel.showImportingContentToast;
        AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
        ((ShowImportingContentToast) aVar.get()).invoke(writeState.isPodcastMode(), (ReadMeta) success.getData());
        return WriteState.copy$default(writeState, false, null, (ReadMeta) success.getData(), null, false, false, false, 122, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new WriteViewModel$listen$1$1(this.this$0, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((WriteViewModel$listen$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        if (r0 == r11) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0166, code lost:
    
        if (r0 == r11) goto L75;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FileService fileService;
        File createTempFile;
        jl.a aVar;
        FileService fileService2;
        Object addUpload$default;
        Logger logger;
        String str;
        Object logAsyncCallTransaction;
        Logger logger2;
        String str2;
        jl.a aVar2;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        Logger logger3;
        String str3;
        jl.a aVar3;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase2;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    File file = (File) this.L$1;
                    sn.a.g(obj);
                    createTempFile = file;
                    addUpload$default = obj;
                    AsyncCallResult asyncCallResult = (AsyncCallResult) addUpload$default;
                    if (asyncCallResult instanceof AsyncCallResult.Error) {
                        logger3 = this.this$0.logger;
                        str3 = this.this$0.tag;
                        logger3.log(str3, "Error saving upload content");
                        aVar3 = this.this$0.toastService;
                        Object obj2 = aVar3.get();
                        obj2.getClass();
                        ToastService toastService = (ToastService) obj2;
                        resolveErrorMessageUseCase2 = this.this$0.resolveErrorMessageUseCase;
                        ToastService.showToast$default(toastService, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase2, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
                        this.this$0.queueStateUpdate(new j(8));
                    } else if (asyncCallResult instanceof AsyncCallResult.Success) {
                        WriteViewModel writeViewModel = this.this$0;
                        writeViewModel.queueStateUpdate(new h(writeViewModel, (AsyncCallResult.Success) asyncCallResult, 4));
                    } else {
                        c6.p();
                        return null;
                    }
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                File file2 = (File) this.L$1;
                sn.a.g(obj);
                createTempFile = file2;
                logAsyncCallTransaction = obj;
                AsyncCallResult asyncCallResult2 = (AsyncCallResult) logAsyncCallTransaction;
                if (asyncCallResult2 instanceof AsyncCallResult.Success) {
                    AddPodcastResult addPodcastResult = (AddPodcastResult) ((AsyncCallResult.Success) asyncCallResult2).getData();
                    if (addPodcastResult instanceof AddPodcastResult.Success) {
                        this.this$0.queueStateUpdate(new z((AddPodcastResult.Success) addPodcastResult, 2));
                    } else if (addPodcastResult instanceof AddPodcastResult.LimitReached) {
                        this.this$0.queueStateUpdate(new a0((AddPodcastResult.LimitReached) addPodcastResult, 2));
                    } else {
                        c6.p();
                        return null;
                    }
                } else if (asyncCallResult2 instanceof AsyncCallResult.Error) {
                    logger2 = this.this$0.logger;
                    str2 = this.this$0.tag;
                    logger2.log(str2, "Error saving podcast content");
                    aVar2 = this.this$0.toastService;
                    Object obj3 = aVar2.get();
                    obj3.getClass();
                    ToastService toastService2 = (ToastService) obj3;
                    resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
                    ToastService.showToast$default(toastService2, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult2, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
                    this.this$0.queueStateUpdate(new j(7));
                } else {
                    c6.p();
                    return null;
                }
            }
        } else {
            sn.a.g(obj);
            fileService = this.this$0.fileService;
            File file3 = new File(fileService.getCacheDirectory(), "uploads");
            file3.mkdirs();
            createTempFile = File.createTempFile(FirebaseAnalytics.Param.CONTENT, ".txt", file3);
            createTempFile.getClass();
            eo.k.n0(createTempFile, this.$this_queueStateUpdate.getText());
            String E0 = tn.o.E0(tn.o.b1(wq.n.z0(this.$this_queueStateUpdate.getText(), new String[]{Separators.SP}, 6), 10), Separators.SP, null, null, null, 62);
            boolean isPodcastMode = this.$this_queueStateUpdate.isPodcastMode();
            WriteViewModel writeViewModel2 = this.this$0;
            xn.a aVar4 = xn.a.f37986a;
            if (isPodcastMode) {
                logger = writeViewModel2.logger;
                str = this.this$0.tag;
                WriteViewModel$listen$1$1$result$1 writeViewModel$listen$1$1$result$1 = new WriteViewModel$listen$1$1$result$1(this.this$0, createTempFile, E0, null);
                this.L$0 = null;
                this.L$1 = createTempFile;
                this.L$2 = null;
                this.label = 1;
                logAsyncCallTransaction = logger.logAsyncCallTransaction(str, "addPodcast-text", writeViewModel$listen$1$1$result$1, this);
            } else {
                aVar = writeViewModel2.readsService;
                Object obj4 = aVar.get();
                obj4.getClass();
                fileService2 = this.this$0.fileService;
                FileData loadFileFromFileSystem = fileService2.loadFileFromFileSystem(createTempFile);
                this.L$0 = null;
                this.L$1 = createTempFile;
                this.L$2 = null;
                this.label = 2;
                addUpload$default = ReadsService.addUpload$default((ReadsService) obj4, loadFileFromFileSystem, ParameterNames.TEXT, E0, null, this, 8, null);
            }
            return aVar4;
        }
        createTempFile.delete();
        return sn.z.f31622a;
    }
}
