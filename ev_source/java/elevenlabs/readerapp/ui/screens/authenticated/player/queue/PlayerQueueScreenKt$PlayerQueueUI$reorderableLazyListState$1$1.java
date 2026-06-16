package io.elevenlabs.readerapp.ui.screens.authenticated.player.queue;

import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import fr.d0;
import ho.r;
import io.elevenlabs.ui.extensions.SafeHapticFeedback;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import sn.z;
import t1.j;
import tn.o;
import u2.z0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueScreenKt$PlayerQueueUI$reorderableLazyListState$1$1", f = "PlayerQueueScreen.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfr/d0;", "Lt1/j;", Constants.MessagePayloadKeys.FROM, "to", "Lsn/z;", "<anonymous>", "(Lfr/d0;Lt1/j;Lt1/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerQueueScreenKt$PlayerQueueUI$reorderableLazyListState$1$1 extends i implements r {
    final /* synthetic */ SafeHapticFeedback $hapticFeedback;
    final /* synthetic */ z0 $queueItems$delegate;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerQueueScreenKt$PlayerQueueUI$reorderableLazyListState$1$1(SafeHapticFeedback safeHapticFeedback, z0 z0Var, wn.c<? super PlayerQueueScreenKt$PlayerQueueUI$reorderableLazyListState$1$1> cVar) {
        super(4, cVar);
        this.$hapticFeedback = safeHapticFeedback;
        this.$queueItems$delegate = z0Var;
    }

    @Override // ho.r
    public final Object invoke(d0 d0Var, j jVar, j jVar2, wn.c<? super z> cVar) {
        PlayerQueueScreenKt$PlayerQueueUI$reorderableLazyListState$1$1 playerQueueScreenKt$PlayerQueueUI$reorderableLazyListState$1$1 = new PlayerQueueScreenKt$PlayerQueueUI$reorderableLazyListState$1$1(this.$hapticFeedback, this.$queueItems$delegate, cVar);
        playerQueueScreenKt$PlayerQueueUI$reorderableLazyListState$1$1.L$0 = jVar;
        playerQueueScreenKt$PlayerQueueUI$reorderableLazyListState$1$1.L$1 = jVar2;
        return playerQueueScreenKt$PlayerQueueUI$reorderableLazyListState$1$1.invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        List PlayerQueueUI_AjpBEmI$lambda$1;
        j jVar = (j) this.L$0;
        j jVar2 = (j) this.L$1;
        if (this.label == 0) {
            sn.a.g(obj);
            z0 z0Var = this.$queueItems$delegate;
            PlayerQueueUI_AjpBEmI$lambda$1 = PlayerQueueScreenKt.PlayerQueueUI_AjpBEmI$lambda$1(z0Var);
            ArrayList i12 = o.i1(PlayerQueueUI_AjpBEmI$lambda$1);
            i12.add(((t1.r) jVar2).f31827a, i12.remove(((t1.r) jVar).f31827a));
            z0Var.setValue(i12);
            this.$hapticFeedback.mo1982performHapticFeedbackCdsT49E(27);
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
