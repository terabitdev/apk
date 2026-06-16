package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.PersistentPlayerQueueService;
import io.elevenlabs.domain.services.player.PlayerService;
import ir.j;
import ir.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$observeQueueState$1", f = "BackgroundPlayerService.kt", l = {461}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$observeQueueState$1 extends i implements p {
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$observeQueueState$1(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$observeQueueState$1> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerService$observeQueueState$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$observeQueueState$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            z1 observeQueueState = this.this$0.getPlayerService().observeQueueState();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            Object collect = observeQueueState.collect(anonymousClass1, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        c6.u();
        return null;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.player.BackgroundPlayerService$observeQueueState$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1<T> implements j {
        final /* synthetic */ BackgroundPlayerService this$0;

        public AnonymousClass1(BackgroundPlayerService backgroundPlayerService) {
            this.this$0 = backgroundPlayerService;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
        
            if (r11 == r7) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(MediaQueueState mediaQueueState, wn.c<? super z> cVar) {
            BackgroundPlayerService$observeQueueState$1$1$emit$1 backgroundPlayerService$observeQueueState$1$1$emit$1;
            int i10;
            if (cVar instanceof BackgroundPlayerService$observeQueueState$1$1$emit$1) {
                backgroundPlayerService$observeQueueState$1$1$emit$1 = (BackgroundPlayerService$observeQueueState$1$1$emit$1) cVar;
                int i11 = backgroundPlayerService$observeQueueState$1$1$emit$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    backgroundPlayerService$observeQueueState$1$1$emit$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = backgroundPlayerService$observeQueueState$1$1$emit$1.result;
                    i10 = backgroundPlayerService$observeQueueState$1$1$emit$1.label;
                    z zVar = z.f31622a;
                    xn.a aVar = xn.a.f37986a;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    sn.a.g(obj);
                                    return zVar;
                                }
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            sn.a.g(obj);
                            List<ReadMeta> list = (List) obj;
                            ib.i.q("Found ", list.size(), " queue items, adding them to queue.", this.this$0.getLogger(), this.this$0.tag);
                            PlayerService playerService = this.this$0.getPlayerService();
                            backgroundPlayerService$observeQueueState$1$1$emit$1.L$0 = null;
                            backgroundPlayerService$observeQueueState$1$1$emit$1.L$1 = null;
                            backgroundPlayerService$observeQueueState$1$1$emit$1.label = 3;
                            if (playerService.addUniqueToQueue(list, backgroundPlayerService$observeQueueState$1$1$emit$1) == aVar) {
                                return aVar;
                            }
                            return zVar;
                        }
                        sn.a.g(obj);
                        return zVar;
                    }
                    sn.a.g(obj);
                    BackgroundPlayerService backgroundPlayerService = this.this$0;
                    if (mediaQueueState != null) {
                        ib.i.q("Saving player queue (", mediaQueueState.getItems().size(), " items) to persistent storage.", backgroundPlayerService.getLogger(), this.this$0.tag);
                        PersistentPlayerQueueService persistentPlayerQueueService = this.this$0.getPersistentPlayerQueueService();
                        List<MediaItemState> items = mediaQueueState.getItems();
                        ArrayList arrayList = new ArrayList(tn.p.a0(items, 10));
                        Iterator<T> it = items.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((MediaItemState) it.next()).getReadId());
                        }
                        backgroundPlayerService$observeQueueState$1$1$emit$1.L$0 = null;
                        backgroundPlayerService$observeQueueState$1$1$emit$1.label = 1;
                        if (persistentPlayerQueueService.saveQueueItems(arrayList, backgroundPlayerService$observeQueueState$1$1$emit$1) != aVar) {
                            return zVar;
                        }
                    } else {
                        backgroundPlayerService.getLogger().log(this.this$0.tag, "Restoring player queue from persistent storage");
                        PersistentPlayerQueueService persistentPlayerQueueService2 = this.this$0.getPersistentPlayerQueueService();
                        backgroundPlayerService$observeQueueState$1$1$emit$1.L$0 = null;
                        backgroundPlayerService$observeQueueState$1$1$emit$1.label = 2;
                        obj = persistentPlayerQueueService2.getLastQueueItems(backgroundPlayerService$observeQueueState$1$1$emit$1);
                    }
                    return aVar;
                }
            }
            backgroundPlayerService$observeQueueState$1$1$emit$1 = new BackgroundPlayerService$observeQueueState$1$1$emit$1(this, cVar);
            Object obj2 = backgroundPlayerService$observeQueueState$1$1$emit$1.result;
            i10 = backgroundPlayerService$observeQueueState$1$1$emit$1.label;
            z zVar2 = z.f31622a;
            xn.a aVar2 = xn.a.f37986a;
            if (i10 == 0) {
            }
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((MediaQueueState) obj, (wn.c<? super z>) cVar);
        }
    }
}
