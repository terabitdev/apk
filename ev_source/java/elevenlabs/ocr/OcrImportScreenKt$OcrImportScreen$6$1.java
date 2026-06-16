package io.elevenlabs.ocr;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.model.LimitReachedData;
import kotlin.Metadata;
import sn.z;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ocr.OcrImportScreenKt$OcrImportScreen$6$1", f = "OcrImportScreen.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OcrImportScreenKt$OcrImportScreen$6$1 extends yn.i implements ho.p {
    final /* synthetic */ ho.l $onNavigateToAddPodcastLimitReached;
    final /* synthetic */ s2 $state$delegate;
    final /* synthetic */ OcrImportViewModel $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrImportScreenKt$OcrImportScreen$6$1(ho.l lVar, OcrImportViewModel ocrImportViewModel, s2 s2Var, wn.c<? super OcrImportScreenKt$OcrImportScreen$6$1> cVar) {
        super(2, cVar);
        this.$onNavigateToAddPodcastLimitReached = lVar;
        this.$vm = ocrImportViewModel;
        this.$state$delegate = s2Var;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new OcrImportScreenKt$OcrImportScreen$6$1(this.$onNavigateToAddPodcastLimitReached, this.$vm, this.$state$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((OcrImportScreenKt$OcrImportScreen$6$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        OcrImportState OcrImportScreen$lambda$2;
        if (this.label == 0) {
            sn.a.g(obj);
            OcrImportScreen$lambda$2 = OcrImportScreenKt.OcrImportScreen$lambda$2(this.$state$delegate);
            LimitReachedData navigateToAddPodcastLimitReached = OcrImportScreen$lambda$2.getNavigateToAddPodcastLimitReached();
            if (navigateToAddPodcastLimitReached != null) {
                this.$onNavigateToAddPodcastLimitReached.invoke(navigateToAddPodcastLimitReached);
                this.$vm.signalNavigatedToAddPodcastLimitReached();
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
