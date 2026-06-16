package io.livekit.android.room;

import as.e9;
import as.jb;
import com.google.protobuf.c6;
import fr.d0;
import fr.n;
import gg.b;
import ho.p;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitModels$TrackInfo;
import sn.z;
import wn.c;
import xn.a;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine$addTrack$3", f = "RTCEngine.kt", l = {1543}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Llivekit/LivekitModels$TrackInfo;", "<anonymous>", "(Lfr/d0;)Llivekit/LivekitModels$TrackInfo;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$addTrack$3 extends i implements p {
    final /* synthetic */ jb $builder;
    final /* synthetic */ String $cid;
    final /* synthetic */ e9 $kind;
    final /* synthetic */ String $name;
    final /* synthetic */ String $stream;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ RTCEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$addTrack$3(RTCEngine rTCEngine, String str, String str2, e9 e9Var, String str3, jb jbVar, c<? super RTCEngine$addTrack$3> cVar) {
        super(2, cVar);
        this.this$0 = rTCEngine;
        this.$cid = str;
        this.$name = str2;
        this.$kind = e9Var;
        this.$stream = str3;
        this.$builder = jbVar;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new RTCEngine$addTrack$3(this.this$0, this.$cid, this.$name, this.$kind, this.$stream, this.$builder, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super LivekitModels$TrackInfo> cVar) {
        return ((RTCEngine$addTrack$3) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        Map map2;
        a aVar = a.f37986a;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
                return obj;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sn.a.g(obj);
        RTCEngine rTCEngine = this.this$0;
        String str = this.$cid;
        String str2 = this.$name;
        e9 e9Var = this.$kind;
        String str3 = this.$stream;
        jb jbVar = this.$builder;
        this.L$0 = rTCEngine;
        this.L$1 = str;
        this.L$2 = str2;
        this.L$3 = e9Var;
        this.L$4 = str3;
        this.L$5 = jbVar;
        this.label = 1;
        n nVar = new n(1, b.V(this));
        nVar.t();
        map = rTCEngine.pendingTrackResolvers;
        synchronized (map) {
            map2 = rTCEngine.pendingTrackResolvers;
            map2.put(str, nVar);
        }
        rTCEngine.getClient().sendAddTrack(str, str2, e9Var, str3, jbVar);
        Object s10 = nVar.s();
        if (s10 == aVar) {
            return aVar;
        }
        return s10;
    }
}
