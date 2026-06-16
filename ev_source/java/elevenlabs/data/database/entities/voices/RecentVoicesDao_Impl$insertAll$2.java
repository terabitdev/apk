package io.elevenlabs.data.database.entities.voices;

import com.google.protobuf.c6;
import ho.l;
import java.util.List;
import kotlin.Metadata;
import sn.z;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.database.entities.voices.RecentVoicesDao_Impl$insertAll$2", f = "RecentVoicesDao_Impl.kt", l = {185}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsn/z;", "<anonymous>", "()V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class RecentVoicesDao_Impl$insertAll$2 extends i implements l {
    final /* synthetic */ long $lastUsedAtUnixMillis;
    final /* synthetic */ List<VoiceEntity> $voices;
    int label;
    final /* synthetic */ RecentVoicesDao_Impl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentVoicesDao_Impl$insertAll$2(RecentVoicesDao_Impl recentVoicesDao_Impl, List<VoiceEntity> list, long j4, wn.c<? super RecentVoicesDao_Impl$insertAll$2> cVar) {
        super(1, cVar);
        this.this$0 = recentVoicesDao_Impl;
        this.$voices = list;
        this.$lastUsedAtUnixMillis = j4;
    }

    @Override // yn.a
    public final wn.c<z> create(wn.c<?> cVar) {
        return new RecentVoicesDao_Impl$insertAll$2(this.this$0, this.$voices, this.$lastUsedAtUnixMillis, cVar);
    }

    @Override // ho.l
    public final Object invoke(wn.c<? super z> cVar) {
        return ((RecentVoicesDao_Impl$insertAll$2) create(cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object insertAll;
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
            RecentVoicesDao_Impl recentVoicesDao_Impl = this.this$0;
            List<VoiceEntity> list = this.$voices;
            long j4 = this.$lastUsedAtUnixMillis;
            this.label = 1;
            insertAll = super/*io.elevenlabs.data.database.entities.voices.RecentVoicesDao*/.insertAll(list, j4, this);
            xn.a aVar = xn.a.f37986a;
            if (insertAll == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
