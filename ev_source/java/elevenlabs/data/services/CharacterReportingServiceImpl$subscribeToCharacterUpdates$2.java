package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import ho.q;
import io.elevenlabs.domain.Logger;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.CharacterReportingServiceImpl$subscribeToCharacterUpdates$2", f = "CharacterReportingServiceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lir/j;", "", "", "it", "Lsn/z;", "<anonymous>", "(Lir/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class CharacterReportingServiceImpl$subscribeToCharacterUpdates$2 extends yn.i implements q {
    int label;
    final /* synthetic */ CharacterReportingServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharacterReportingServiceImpl$subscribeToCharacterUpdates$2(CharacterReportingServiceImpl characterReportingServiceImpl, wn.c<? super CharacterReportingServiceImpl$subscribeToCharacterUpdates$2> cVar) {
        super(3, cVar);
        this.this$0 = characterReportingServiceImpl;
    }

    @Override // ho.q
    public final Object invoke(ir.j jVar, Throwable th, wn.c<? super z> cVar) {
        return new CharacterReportingServiceImpl$subscribeToCharacterUpdates$2(this.this$0, cVar).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        String str;
        if (this.label == 0) {
            sn.a.g(obj);
            logger = this.this$0.logger;
            str = this.this$0.tag;
            logger.log(str, "Subscriber disconnected");
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
