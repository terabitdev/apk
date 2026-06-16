package io.elevenlabs.ocr;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import fr.d0;
import fr.g0;
import fr.j0;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.AddPodcastResult;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ocr.OcrImportViewModel$listen$1$1", f = "OcrImportScreen.kt", l = {RCHTTPStatusCodes.CREATED, 220, 261}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OcrImportViewModel$listen$1$1 extends yn.i implements ho.p {
    final /* synthetic */ OcrImportState $this_queueStateUpdate;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ OcrImportViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrImportViewModel$listen$1$1(OcrImportState ocrImportState, OcrImportViewModel ocrImportViewModel, wn.c<? super OcrImportViewModel$listen$1$1> cVar) {
        super(2, cVar);
        this.$this_queueStateUpdate = ocrImportState;
        this.this$0 = ocrImportViewModel;
    }

    public static final OcrImportState invokeSuspend$lambda$3(AddPodcastResult addPodcastResult, OcrImportState ocrImportState) {
        return OcrImportState.copy$default(ocrImportState, null, null, null, false, ((AddPodcastResult.Success) addPodcastResult).getMeta(), null, false, 103, null);
    }

    public static final OcrImportState invokeSuspend$lambda$4(AddPodcastResult addPodcastResult, OcrImportState ocrImportState) {
        return OcrImportState.copy$default(ocrImportState, null, null, null, false, null, ((AddPodcastResult.LimitReached) addPodcastResult).getData(), false, 87, null);
    }

    public static final OcrImportState invokeSuspend$lambda$6(AsyncCallResult asyncCallResult, OcrImportState ocrImportState) {
        return OcrImportState.copy$default(ocrImportState, null, null, null, false, (ReadMeta) ((AsyncCallResult.Success) asyncCallResult).getData(), null, false, 103, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        OcrImportViewModel$listen$1$1 ocrImportViewModel$listen$1$1 = new OcrImportViewModel$listen$1$1(this.$this_queueStateUpdate, this.this$0, cVar);
        ocrImportViewModel$listen$1$1.L$0 = obj;
        return ocrImportViewModel$listen$1$1;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((OcrImportViewModel$listen$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
    
        if (r15 == r7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a1, code lost:
    
        if (r15 == r7) goto L114;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        String str;
        FileService fileService;
        File createTempFile;
        String str2;
        String str3;
        String str4;
        jl.a aVar2;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        String str5;
        jl.a aVar3;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase2;
        d0 d0Var = (d0) this.L$0;
        int i10 = this.label;
        z zVar = z.f31622a;
        xn.a aVar4 = xn.a.f37986a;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            createTempFile = (File) this.L$3;
                            sn.a.g(obj);
                            AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
                            if (asyncCallResult instanceof AsyncCallResult.Success) {
                                this.this$0.queueStateUpdate(new y((AsyncCallResult.Success) asyncCallResult, 2));
                            } else if (asyncCallResult instanceof AsyncCallResult.Error) {
                                Logger logger = this.this$0.getLogger();
                                str5 = this.this$0.tag;
                                logger.log(str5, "Error saving upload content");
                                aVar3 = this.this$0.toastService;
                                Object obj2 = aVar3.get();
                                obj2.getClass();
                                ToastService toastService = (ToastService) obj2;
                                resolveErrorMessageUseCase2 = this.this$0.resolveErrorMessageUseCase;
                                ToastService.showToast$default(toastService, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase2, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
                                this.this$0.queueStateUpdate(new x(2));
                            } else {
                                c6.p();
                                return null;
                            }
                            createTempFile.delete();
                            return zVar;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    createTempFile = (File) this.L$3;
                    sn.a.g(obj);
                    AsyncCallResult asyncCallResult2 = (AsyncCallResult) obj;
                    if (asyncCallResult2 instanceof AsyncCallResult.Success) {
                        AddPodcastResult addPodcastResult = (AddPodcastResult) ((AsyncCallResult.Success) asyncCallResult2).getData();
                        if (addPodcastResult instanceof AddPodcastResult.Success) {
                            this.this$0.queueStateUpdate(new y((AddPodcastResult.Success) addPodcastResult, 0));
                        } else if (addPodcastResult instanceof AddPodcastResult.LimitReached) {
                            this.this$0.queueStateUpdate(new y((AddPodcastResult.LimitReached) addPodcastResult, 1));
                        } else {
                            c6.p();
                            return null;
                        }
                    } else if (asyncCallResult2 instanceof AsyncCallResult.Error) {
                        Logger logger2 = this.this$0.getLogger();
                        str4 = this.this$0.tag;
                        logger2.log(str4, "Error saving podcast content");
                        aVar2 = this.this$0.toastService;
                        Object obj3 = aVar2.get();
                        obj3.getClass();
                        ToastService toastService2 = (ToastService) obj3;
                        resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
                        ToastService.showToast$default(toastService2, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult2, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
                        this.this$0.queueStateUpdate(new x(1));
                    } else {
                        c6.p();
                        return null;
                    }
                    createTempFile.delete();
                    return zVar;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                List<Uri> images = this.$this_queueStateUpdate.getImages();
                OcrImportViewModel ocrImportViewModel = this.this$0;
                ArrayList arrayList = new ArrayList(tn.p.a0(images, 10));
                Iterator<T> it = images.iterator();
                while (it.hasNext()) {
                    arrayList.add(g0.g(d0Var, null, new OcrImportViewModel$listen$1$1$text$1$1(ocrImportViewModel, (Uri) it.next(), null), 3));
                }
                this.L$0 = null;
                this.label = 1;
                if (arrayList.isEmpty()) {
                    obj = tn.t.f33547a;
                } else {
                    obj = new fr.e((j0[]) arrayList.toArray(new j0[0])).a(this);
                }
                if (obj == aVar4) {
                    return aVar4;
                }
            }
            String E0 = tn.o.E0((Iterable) obj, "\n\n", null, null, null, 62);
            fileService = this.this$0.fileService;
            File file = new File(fileService.getCacheDirectory(), "uploads");
            file.mkdirs();
            createTempFile = File.createTempFile(FirebaseAnalytics.Param.CONTENT, ".txt", file);
            createTempFile.getClass();
            eo.k.n0(createTempFile, E0);
            boolean isPodcastMode = this.$this_queueStateUpdate.isPodcastMode();
            OcrImportViewModel ocrImportViewModel2 = this.this$0;
            if (isPodcastMode) {
                Logger logger3 = ocrImportViewModel2.getLogger();
                str3 = this.this$0.tag;
                OcrImportViewModel$listen$1$1$result$1 ocrImportViewModel$listen$1$1$result$1 = new OcrImportViewModel$listen$1$1$result$1(this.this$0, createTempFile, E0, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = createTempFile;
                this.label = 2;
                obj = logger3.logAsyncCallTransaction(str3, "addPodcast-ocr", ocrImportViewModel$listen$1$1$result$1, this);
            } else {
                Logger logger4 = ocrImportViewModel2.getLogger();
                str2 = this.this$0.tag;
                OcrImportViewModel$listen$1$1$result$2 ocrImportViewModel$listen$1$1$result$2 = new OcrImportViewModel$listen$1$1$result$2(this.this$0, createTempFile, E0, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = createTempFile;
                this.label = 3;
                obj = logger4.logAsyncCallTransaction(str2, "addUpload-ocr", ocrImportViewModel$listen$1$1$result$2, this);
            }
            return aVar4;
        } catch (Exception e10) {
            aVar = this.this$0.toastService;
            Object obj4 = aVar.get();
            obj4.getClass();
            ToastService.showToast$default((ToastService) obj4, "Can't run text recognition", null, ToastService.ToastVariant.ERROR, 2, null);
            Logger logger5 = this.this$0.getLogger();
            str = this.this$0.tag;
            logger5.logError(str, "Error running text recognition", e10);
            this.this$0.queueStateUpdate(new x(0));
            return zVar;
        }
    }
}
