package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ReadsService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareOptionsViewModel$setReadId$1$1", f = "ReadShareOptionsSheet.kt", l = {LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReadShareOptionsViewModel$setReadId$1$1 extends yn.i implements ho.p {
    final /* synthetic */ String $readId;
    int label;
    final /* synthetic */ ReadShareOptionsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadShareOptionsViewModel$setReadId$1$1(ReadShareOptionsViewModel readShareOptionsViewModel, String str, wn.c<? super ReadShareOptionsViewModel$setReadId$1$1> cVar) {
        super(2, cVar);
        this.this$0 = readShareOptionsViewModel;
        this.$readId = str;
    }

    public static final ReadShareOptionsState invokeSuspend$lambda$0$0(ReadMeta readMeta, ReadShareOptionsState readShareOptionsState) {
        return readShareOptionsState.copy(readMeta);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ReadShareOptionsViewModel$setReadId$1$1(this.this$0, this.$readId, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ReadShareOptionsViewModel$setReadId$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ReadsService readsService;
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
            readsService = this.this$0.readsService;
            String str = this.$readId;
            this.label = 1;
            obj = readsService.getRead(str, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        ReadMeta readMeta = (ReadMeta) obj;
        if (readMeta != null) {
            this.this$0.queueStateUpdate(new r0(1, readMeta));
        }
        return sn.z.f31622a;
    }
}
