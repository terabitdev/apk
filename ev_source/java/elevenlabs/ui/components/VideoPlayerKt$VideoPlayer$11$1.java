package io.elevenlabs.ui.components;

import androidx.media3.exoplayer.ExoPlayer;
import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.VideoPlayerKt$VideoPlayer$11$1", f = "VideoPlayer.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VideoPlayerKt$VideoPlayer$11$1 extends yn.i implements ho.p {
    final /* synthetic */ u2.z0 $exoPlayer$delegate;
    final /* synthetic */ Float $hueAdjustmentDegrees;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPlayerKt$VideoPlayer$11$1(Float f10, u2.z0 z0Var, wn.c<? super VideoPlayerKt$VideoPlayer$11$1> cVar) {
        super(2, cVar);
        this.$hueAdjustmentDegrees = f10;
        this.$exoPlayer$delegate = z0Var;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new VideoPlayerKt$VideoPlayer$11$1(this.$hueAdjustmentDegrees, this.$exoPlayer$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((VideoPlayerKt$VideoPlayer$11$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        r3 = io.elevenlabs.ui.components.VideoPlayerKt.VideoPlayer__Ogyb9c$lambda$9(r2.$exoPlayer$delegate);
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ExoPlayer VideoPlayer__Ogyb9c$lambda$9;
        if (this.label == 0) {
            sn.a.g(obj);
            if (this.$hueAdjustmentDegrees != null && VideoPlayer__Ogyb9c$lambda$9 != null) {
                Float f10 = this.$hueAdjustmentDegrees;
                f10.getClass();
                ((g8.i0) VideoPlayer__Ogyb9c$lambda$9).u(ig.f.H(new f8.d0(f10.floatValue() % 360.0f)));
            }
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
