package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.domain.Logger;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.CharacterReportingServiceImpl$subscribeToCharacterUpdates$1", f = "CharacterReportingServiceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lir/j;", "", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class CharacterReportingServiceImpl$subscribeToCharacterUpdates$1 extends yn.i implements p {
    int label;
    final /* synthetic */ CharacterReportingServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharacterReportingServiceImpl$subscribeToCharacterUpdates$1(CharacterReportingServiceImpl characterReportingServiceImpl, wn.c<? super CharacterReportingServiceImpl$subscribeToCharacterUpdates$1> cVar) {
        super(2, cVar);
        this.this$0 = characterReportingServiceImpl;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new CharacterReportingServiceImpl$subscribeToCharacterUpdates$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
        return ((CharacterReportingServiceImpl$subscribeToCharacterUpdates$1) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        String str;
        if (this.label == 0) {
            sn.a.g(obj);
            logger = this.this$0.logger;
            str = this.this$0.tag;
            logger.log(str, "New subscriber connected");
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
