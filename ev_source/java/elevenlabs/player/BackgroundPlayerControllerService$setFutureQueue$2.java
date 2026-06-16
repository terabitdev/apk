package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.MediaItemState;
import ja.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import w7.r0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerControllerService$setFutureQueue$2", f = "BackgroundPlayerControllerService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerControllerService$setFutureQueue$2 extends i implements p {
    final /* synthetic */ z $controller;
    final /* synthetic */ List<MediaItemState> $items;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerControllerService$setFutureQueue$2(List<MediaItemState> list, z zVar, wn.c<? super BackgroundPlayerControllerService$setFutureQueue$2> cVar) {
        super(2, cVar);
        this.$items = list;
        this.$controller = zVar;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerControllerService$setFutureQueue$2(this.$items, this.$controller, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((BackgroundPlayerControllerService$setFutureQueue$2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            List<MediaItemState> list = this.$items;
            z zVar = this.$controller;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                r0 access$findExistingItem = BackgroundPlayerControllerServiceKt.access$findExistingItem(zVar, ((MediaItemState) it.next()).getReadId());
                if (access$findExistingItem != null) {
                    arrayList.add(access$findExistingItem);
                }
            }
            z zVar2 = this.$controller;
            zVar2.replaceMediaItems(zVar2.getCurrentMediaItemIndex() + 1, this.$controller.getMediaItemCount(), arrayList);
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
