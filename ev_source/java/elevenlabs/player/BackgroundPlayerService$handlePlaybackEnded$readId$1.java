package io.elevenlabs.player;

import android.os.Bundle;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.player.media.MediaItemCreator;
import kotlin.Metadata;
import sn.z;
import w7.q1;
import w7.r1;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$handlePlaybackEnded$readId$1", f = "BackgroundPlayerService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "", "<anonymous>", "(Lfr/d0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$handlePlaybackEnded$readId$1 extends i implements p {
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$handlePlaybackEnded$readId$1(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$handlePlaybackEnded$readId$1> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerService$handlePlaybackEnded$readId$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super String> cVar) {
        return ((BackgroundPlayerService$handlePlaybackEnded$readId$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        String string;
        if (this.label == 0) {
            sn.a.g(obj);
            r1 currentTimeline = this.this$0.getPlayer().getCurrentTimeline();
            currentTimeline.getClass();
            if (!currentTimeline.p()) {
                try {
                    q1 q1Var = new q1();
                    currentTimeline.n(0, q1Var);
                    Bundle bundle = q1Var.f36553c.f36581d.J;
                    if (bundle != null && (string = bundle.getString(MediaItemCreator.EXTRA_PARENT_READ_ID)) != null) {
                        return string;
                    }
                    String str = q1Var.f36553c.f36578a;
                    str.getClass();
                    if (str.length() > 0) {
                        return str;
                    }
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            }
            return null;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
