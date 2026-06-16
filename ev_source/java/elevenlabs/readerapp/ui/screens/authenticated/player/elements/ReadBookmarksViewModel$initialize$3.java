package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ReadsService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel$initialize$3", f = "BookmarksSheet.kt", l = {95}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReadBookmarksViewModel$initialize$3 extends yn.i implements ho.p {
    final /* synthetic */ String $readId;
    int label;
    final /* synthetic */ ReadBookmarksViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadBookmarksViewModel$initialize$3(ReadBookmarksViewModel readBookmarksViewModel, String str, wn.c<? super ReadBookmarksViewModel$initialize$3> cVar) {
        super(2, cVar);
        this.this$0 = readBookmarksViewModel;
        this.$readId = str;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ReadBookmarksViewModel$initialize$3(this.this$0, this.$readId, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ReadBookmarksViewModel$initialize$3) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
            readsService = this.this$0.readService;
            ir.i observeRead = readsService.observeRead(this.$readId);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            Object collect = observeRead.collect(anonymousClass1, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel$initialize$3$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements ir.j {
        final /* synthetic */ ReadBookmarksViewModel this$0;

        public AnonymousClass1(ReadBookmarksViewModel readBookmarksViewModel) {
            this.this$0 = readBookmarksViewModel;
        }

        public static final ReadBookmarksState emit$lambda$0(ReadMeta readMeta, ReadBookmarksState readBookmarksState) {
            readBookmarksState.getClass();
            return ReadBookmarksState.copy$default(readBookmarksState, null, readMeta.getTitle(), null, false, 13, null);
        }

        public final Object emit(ReadMeta readMeta, wn.c<? super sn.z> cVar) {
            if (readMeta != null) {
                this.this$0.queueStateUpdate(new s(0, readMeta));
            }
            return sn.z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((ReadMeta) obj, (wn.c<? super sn.z>) cVar);
        }
    }
}
