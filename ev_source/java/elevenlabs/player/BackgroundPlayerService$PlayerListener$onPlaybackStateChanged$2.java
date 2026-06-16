package io.elevenlabs.player;

import android.os.Bundle;
import com.google.protobuf.c6;
import fr.d0;
import gh.e0;
import gh.l0;
import gh.w1;
import ho.p;
import io.elevenlabs.player.media.MediaItemCreator;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sn.z;
import w7.g0;
import w7.h0;
import w7.k0;
import w7.n0;
import w7.q1;
import w7.r0;
import w7.r1;
import w7.u0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$PlayerListener$onPlaybackStateChanged$2", f = "BackgroundPlayerService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$PlayerListener$onPlaybackStateChanged$2 extends i implements p {
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$PlayerListener$onPlaybackStateChanged$2(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$PlayerListener$onPlaybackStateChanged$2> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerService$PlayerListener$onPlaybackStateChanged$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$PlayerListener$onPlaybackStateChanged$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0058  */
    /* JADX WARN: Type inference failed for: r4v0, types: [w7.h0, w7.i0] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q1 q1Var;
        Bundle bundle;
        String str;
        String str2;
        r0 r0Var;
        String str3 = null;
        if (this.label == 0) {
            sn.a.g(obj);
            r1 currentTimeline = this.this$0.getPlayer().getCurrentTimeline();
            currentTimeline.getClass();
            if (!currentTimeline.p()) {
                try {
                    q1Var = new q1();
                    currentTimeline.n(0, q1Var);
                    bundle = q1Var.f36553c.f36581d.J;
                } catch (Exception e10) {
                    ib.i.r("Failed to extract readId from timeline: ", e10.getMessage(), this.this$0.getLogger(), this.this$0.tag);
                }
                if (bundle != null) {
                    str = bundle.getString(MediaItemCreator.EXTRA_PARENT_READ_ID);
                    if (str == null) {
                    }
                    if (str == null) {
                        str = this.this$0.currentReadId;
                    }
                    str2 = str;
                    if (str2 != null && str2.length() > 0) {
                        r0Var = (r0) this.this$0.currentMediaItem.getValue();
                        if (r0Var != null) {
                            str3 = r0Var.f36578a;
                        }
                        if (!m.c(str3, str2)) {
                            g0 g0Var = new g0();
                            e0 e0Var = l0.f11452b;
                            w1 w1Var = w1.f11531e;
                            List list = Collections.EMPTY_LIST;
                            w1 w1Var2 = w1.f11531e;
                            this.this$0.currentMediaItem.tryEmit(new r0(str2, new h0(g0Var), null, new w7.l0(new k0()), u0.L, n0.f36483d));
                            this.this$0.currentReadId = str2;
                        }
                    }
                    return z.f31622a;
                }
                str = q1Var.f36553c.f36578a;
                str.getClass();
                if (str == null) {
                }
                str2 = str;
                if (str2 != null) {
                    r0Var = (r0) this.this$0.currentMediaItem.getValue();
                    if (r0Var != null) {
                    }
                    if (!m.c(str3, str2)) {
                    }
                }
                return z.f31622a;
            }
            str = null;
            if (str == null) {
            }
            str2 = str;
            if (str2 != null) {
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
