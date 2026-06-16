package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import sn.z;
import w1.e0;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.PlayerAdditionalActionsPagerKt$PlayerAdditionalActionsPager$1$1", f = "PlayerAdditionalActionsPager.kt", l = {60, 64, 69, 71}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerAdditionalActionsPagerKt$PlayerAdditionalActionsPager$1$1 extends i implements p {
    final /* synthetic */ e0 $pagerState;
    final /* synthetic */ boolean $showTeaser;
    float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerAdditionalActionsPagerKt$PlayerAdditionalActionsPager$1$1(boolean z6, e0 e0Var, wn.c<? super PlayerAdditionalActionsPagerKt$PlayerAdditionalActionsPager$1$1> cVar) {
        super(2, cVar);
        this.$showTeaser = z6;
        this.$pagerState = e0Var;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new PlayerAdditionalActionsPagerKt$PlayerAdditionalActionsPager$1$1(this.$showTeaser, this.$pagerState, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((PlayerAdditionalActionsPagerKt$PlayerAdditionalActionsPager$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008e, code lost:
    
        if (w1.e0.g(r6, 0, t2.u.P, null, r10, 6) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0090, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (fr.g0.m(300, r12) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (w1.e0.g(r6, 0, r8, null, r10, 4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (fr.g0.m(3000, r12) == r5) goto L27;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float e10;
        PlayerAdditionalActionsPagerKt$PlayerAdditionalActionsPager$1$1 playerAdditionalActionsPagerKt$PlayerAdditionalActionsPager$1$1;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        e10 = this.F$0;
                        sn.a.g(obj);
                        playerAdditionalActionsPagerKt$PlayerAdditionalActionsPager$1$1 = this;
                        e0 e0Var = playerAdditionalActionsPagerKt$PlayerAdditionalActionsPager$1$1.$pagerState;
                        playerAdditionalActionsPagerKt$PlayerAdditionalActionsPager$1$1.F$0 = e10;
                        playerAdditionalActionsPagerKt$PlayerAdditionalActionsPager$1$1.label = 4;
                    }
                } else {
                    e10 = this.F$0;
                    sn.a.g(obj);
                    playerAdditionalActionsPagerKt$PlayerAdditionalActionsPager$1$1 = this;
                    playerAdditionalActionsPagerKt$PlayerAdditionalActionsPager$1$1.F$0 = e10;
                    playerAdditionalActionsPagerKt$PlayerAdditionalActionsPager$1$1.label = 3;
                }
            } else {
                sn.a.g(obj);
                e10 = ((int) (this.$pagerState.l().e() >> 32)) * 0.05f;
                e0 e0Var2 = this.$pagerState;
                float e11 = e10 / ((int) (e0Var2.l().e() >> 32));
                this.F$0 = e10;
                this.label = 2;
                playerAdditionalActionsPagerKt$PlayerAdditionalActionsPager$1$1 = this;
            }
        } else {
            sn.a.g(obj);
            if (this.$showTeaser) {
                this.label = 1;
            }
        }
        return z.f31622a;
    }
}
