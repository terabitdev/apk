package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ReadsService;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$loadReadDetails$2", f = "ReadDetailsViewModel.kt", l = {486, 492}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReadDetailsViewModel$loadReadDetails$2 extends yn.i implements ho.p {
    final /* synthetic */ String $readId;
    Object L$0;
    int label;
    final /* synthetic */ ReadDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadDetailsViewModel$loadReadDetails$2(ReadDetailsViewModel readDetailsViewModel, String str, wn.c<? super ReadDetailsViewModel$loadReadDetails$2> cVar) {
        super(2, cVar);
        this.this$0 = readDetailsViewModel;
        this.$readId = str;
    }

    public static final ReadDetailsState invokeSuspend$lambda$0(ReadMeta readMeta, ReadDetailsState readDetailsState) {
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, readMeta, false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217719, null);
    }

    public static final ReadDetailsState invokeSuspend$lambda$1(AsyncCallResult asyncCallResult, ReadDetailsState readDetailsState) {
        return ReadDetailsState.copy$default(readDetailsState, null, false, null, (ReadMeta) ((AsyncCallResult.Success) asyncCallResult).getData(), false, false, null, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217719, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ReadDetailsViewModel$loadReadDetails$2(this.this$0, this.$readId, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ReadDetailsViewModel$loadReadDetails$2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r5 == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0030, code lost:
    
        if (r5 == r3) goto L49;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReadsService readsService;
        ReadsService readsService2;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
                    if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                        if (asyncCallResult instanceof AsyncCallResult.Success) {
                            this.this$0.queueStateUpdate(new n0((AsyncCallResult.Success) asyncCallResult, 0));
                        } else {
                            c6.p();
                            return null;
                        }
                    }
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            readsService = this.this$0.readsService;
            String str = this.$readId;
            this.label = 1;
            obj = readsService.getRead(str, this);
        }
        ReadMeta readMeta = (ReadMeta) obj;
        ReadDetailsViewModel readDetailsViewModel = this.this$0;
        if (readMeta != null) {
            readDetailsViewModel.queueStateUpdate(new j0(readMeta, 2));
            return sn.z.f31622a;
        }
        readsService2 = readDetailsViewModel.readsService;
        String str2 = this.$readId;
        this.L$0 = null;
        this.label = 2;
        obj = readsService2.refreshRead(str2, false, this);
    }
}
