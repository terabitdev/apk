package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.AudioOnlyPlayerUiKt$AnimatedBlurredBackground$1$1", f = "AudioOnlyPlayerUi.kt", l = {120}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AudioOnlyPlayerUiKt$AnimatedBlurredBackground$1$1 extends yn.i implements ho.p {
    final /* synthetic */ u2.w0 $blurRadius$delegate;
    final /* synthetic */ androidx.lifecycle.b0 $lifecycleOwner;
    final /* synthetic */ u2.w0 $offsetX$delegate;
    final /* synthetic */ u2.w0 $offsetY$delegate;
    final /* synthetic */ u2.w0 $scale$delegate;
    final /* synthetic */ boolean $shouldAnimate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioOnlyPlayerUiKt$AnimatedBlurredBackground$1$1(boolean z6, androidx.lifecycle.b0 b0Var, u2.w0 w0Var, u2.w0 w0Var2, u2.w0 w0Var3, u2.w0 w0Var4, wn.c<? super AudioOnlyPlayerUiKt$AnimatedBlurredBackground$1$1> cVar) {
        super(2, cVar);
        this.$shouldAnimate = z6;
        this.$lifecycleOwner = b0Var;
        this.$scale$delegate = w0Var;
        this.$offsetX$delegate = w0Var2;
        this.$offsetY$delegate = w0Var3;
        this.$blurRadius$delegate = w0Var4;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new AudioOnlyPlayerUiKt$AnimatedBlurredBackground$1$1(this.$shouldAnimate, this.$lifecycleOwner, this.$scale$delegate, this.$offsetX$delegate, this.$offsetY$delegate, this.$blurRadius$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AudioOnlyPlayerUiKt$AnimatedBlurredBackground$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        if (r9.$shouldAnimate != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003e -> B:5:0x0041). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        androidx.lifecycle.u uVar = androidx.lifecycle.u.f2894d;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
                if (this.$lifecycleOwner.getLifecycle().getCurrentState().compareTo(uVar) >= 0) {
                    u2.w0 w0Var = this.$scale$delegate;
                    lo.c cVar = lo.d.f21964a;
                    AudioOnlyPlayerUiKt.AnimatedBlurredBackground$lambda$2(w0Var, (float) cVar.g(2.3d, 2.6d));
                    AudioOnlyPlayerUiKt.AnimatedBlurredBackground$lambda$5(this.$offsetX$delegate, (float) cVar.g(-90.0d, 90.0d));
                    AudioOnlyPlayerUiKt.AnimatedBlurredBackground$lambda$8(this.$offsetY$delegate, (float) cVar.g(-90.0d, 90.0d));
                    AudioOnlyPlayerUiKt.AnimatedBlurredBackground$lambda$11(this.$blurRadius$delegate, (float) cVar.g(100.0d, 170.0d));
                }
                if (this.$lifecycleOwner.getLifecycle().getCurrentState().compareTo(uVar) >= 0) {
                    long f10 = lo.d.f21965b.f(20000L, 40000L);
                    this.label = 1;
                    Object m10 = fr.g0.m(f10, this);
                    xn.a aVar = xn.a.f37986a;
                    if (m10 == aVar) {
                        return aVar;
                    }
                    if (this.$lifecycleOwner.getLifecycle().getCurrentState().compareTo(uVar) >= 0) {
                    }
                    if (this.$lifecycleOwner.getLifecycle().getCurrentState().compareTo(uVar) >= 0) {
                    }
                }
                return sn.z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sn.a.g(obj);
    }
}
