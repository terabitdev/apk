package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$prefetchAllChapters$1", f = "PlayerViewModel.kt", l = {1258}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerViewModel$prefetchAllChapters$1 extends yn.i implements ho.p {
    final /* synthetic */ List<Integer> $chapterIndices;
    final /* synthetic */ int $cursorIdx;
    final /* synthetic */ String $readId;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ PlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$prefetchAllChapters$1(List<Integer> list, int i10, PlayerViewModel playerViewModel, String str, wn.c<? super PlayerViewModel$prefetchAllChapters$1> cVar) {
        super(2, cVar);
        this.$chapterIndices = list;
        this.$cursorIdx = i10;
        this.this$0 = playerViewModel;
        this.$readId = str;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PlayerViewModel$prefetchAllChapters$1(this.$chapterIndices, this.$cursorIdx, this.this$0, this.$readId, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerViewModel$prefetchAllChapters$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        PlayerViewModel playerViewModel;
        int i10;
        String str;
        Iterator it;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                i10 = this.I$0;
                it = (Iterator) this.L$4;
                str = (String) this.L$3;
                playerViewModel = (PlayerViewModel) this.L$2;
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            List<Integer> list = this.$chapterIndices;
            final int i12 = this.$cursorIdx;
            ArrayList m12 = tn.o.m1(tn.o.b1(tn.o.a1(new Comparator() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$prefetchAllChapters$1$invokeSuspend$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return wn.e.g(Integer.valueOf(Math.abs(((Number) t10).intValue() - i12)), Integer.valueOf(Math.abs(((Number) t11).intValue() - i12)));
                }
            }, list), 5), 1, 1, true);
            playerViewModel = this.this$0;
            i10 = 0;
            str = this.$readId;
            it = m12.iterator();
        }
        while (it.hasNext()) {
            List list2 = (List) it.next();
            if (!kotlin.jvm.internal.m.c(((PlayerState) playerViewModel.getStateFlow().getValue()).getReadId(), str)) {
                break;
            }
            PlayerViewModel$prefetchAllChapters$1$1$1 playerViewModel$prefetchAllChapters$1$1$1 = new PlayerViewModel$prefetchAllChapters$1$1$1(list2, playerViewModel, str, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = playerViewModel;
            this.L$3 = str;
            this.L$4 = it;
            this.L$5 = null;
            this.L$6 = null;
            this.I$0 = i10;
            this.I$1 = 0;
            this.label = 1;
            Object l4 = fr.g0.l(playerViewModel$prefetchAllChapters$1$1$1, this);
            xn.a aVar = xn.a.f37986a;
            if (l4 == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }
}
