package io.elevenlabs.readerapp.ui.screens.authenticated.player.contents;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import t1.z;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.contents.PlayerContentsScreenKt$PlayerContentsScreenUI$1$1", f = "PlayerContentsScreen.kt", l = {129}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerContentsScreenKt$PlayerContentsScreenUI$1$1 extends yn.i implements p {
    final /* synthetic */ s2 $currentChapterIndex$delegate;
    final /* synthetic */ z $listState;
    final /* synthetic */ int $scrollOffset;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerContentsScreenKt$PlayerContentsScreenUI$1$1(z zVar, int i10, s2 s2Var, wn.c<? super PlayerContentsScreenKt$PlayerContentsScreenUI$1$1> cVar) {
        super(2, cVar);
        this.$listState = zVar;
        this.$scrollOffset = i10;
        this.$currentChapterIndex$delegate = s2Var;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PlayerContentsScreenKt$PlayerContentsScreenUI$1$1(this.$listState, this.$scrollOffset, this.$currentChapterIndex$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerContentsScreenKt$PlayerContentsScreenUI$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int PlayerContentsScreenUI$lambda$0;
        int PlayerContentsScreenUI$lambda$02;
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
            PlayerContentsScreenUI$lambda$0 = PlayerContentsScreenKt.PlayerContentsScreenUI$lambda$0(this.$currentChapterIndex$delegate);
            if (PlayerContentsScreenUI$lambda$0 >= 0) {
                z zVar = this.$listState;
                PlayerContentsScreenUI$lambda$02 = PlayerContentsScreenKt.PlayerContentsScreenUI$lambda$0(this.$currentChapterIndex$delegate);
                int i11 = (PlayerContentsScreenUI$lambda$02 * 2) - 1;
                if (i11 < 0) {
                    i11 = 0;
                }
                int i12 = this.$scrollOffset;
                this.label = 1;
                Object f10 = zVar.f(i11, i12, this);
                xn.a aVar = xn.a.f37986a;
                if (f10 == aVar) {
                    return aVar;
                }
            }
        }
        return sn.z.f31622a;
    }
}
