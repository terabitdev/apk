package io.elevenlabs.player;

import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import gh.l0;
import ho.p;
import io.elevenlabs.domain.model.PlayerPreferences;
import ir.r;
import ja.c2;
import ja.h2;
import ja.w2;
import ja.z1;
import java.util.List;
import kotlin.Metadata;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$observePlayerPreferences$1", f = "BackgroundPlayerService.kt", l = {365}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$observePlayerPreferences$1 extends i implements p {
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$observePlayerPreferences$1$1", f = "BackgroundPlayerService.kt", l = {372}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/elevenlabs/domain/model/PlayerPreferences;", "prefs", "Lsn/z;", "<anonymous>", "(Lio/elevenlabs/domain/model/PlayerPreferences;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.player.BackgroundPlayerService$observePlayerPreferences$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ BackgroundPlayerService this$0;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$observePlayerPreferences$1$1$1", f = "BackgroundPlayerService.kt", l = {}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.player.BackgroundPlayerService$observePlayerPreferences$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C00191 extends i implements p {
            final /* synthetic */ List<ja.d> $buttons;
            int label;
            final /* synthetic */ BackgroundPlayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00191(BackgroundPlayerService backgroundPlayerService, List<ja.d> list, wn.c<? super C00191> cVar) {
                super(2, cVar);
                this.this$0 = backgroundPlayerService;
                this.$buttons = list;
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                return new C00191(this.this$0, this.$buttons, cVar);
            }

            @Override // ho.p
            public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
                return ((C00191) create(d0Var, cVar)).invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    sn.a.g(obj);
                    z1 z1Var = this.this$0.mediaSession;
                    if (z1Var != null) {
                        List<ja.d> list = this.$buttons;
                        gg.b.v(list, "media button preferences must not be null");
                        h2 h2Var = z1Var.f19331a;
                        l0 l4 = l0.l(list);
                        h2Var.C = l4;
                        w2 w2Var = h2Var.f18911h;
                        w2Var.f19271w = l4;
                        w2Var.M();
                        h2Var.e(new c2(l4));
                    }
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BackgroundPlayerService backgroundPlayerService, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = backgroundPlayerService;
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ho.p
        public final Object invoke(PlayerPreferences playerPreferences, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(playerPreferences, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            List buildMediaButtons;
            PlayerPreferences playerPreferences = (PlayerPreferences) this.L$0;
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
                this.this$0.cachedForwardAction = playerPreferences.getForwardButtonAction();
                this.this$0.cachedBackAction = playerPreferences.getBackButtonAction();
                this.this$0.cachedNextAction = playerPreferences.getNextButtonAction();
                this.this$0.cachedPreviousAction = playerPreferences.getPreviousButtonAction();
                buildMediaButtons = this.this$0.buildMediaButtons(playerPreferences.getForwardButtonAction(), playerPreferences.getBackButtonAction());
                fr.z main = this.this$0.getDispatcherFactory().getMain();
                C00191 c00191 = new C00191(this.this$0, buildMediaButtons, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object Q = g0.Q(main, c00191, this);
                xn.a aVar = xn.a.f37986a;
                if (Q == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$observePlayerPreferences$1(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$observePlayerPreferences$1> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerService$observePlayerPreferences$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$observePlayerPreferences$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
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
            ir.i preferences = this.this$0.getPlayerPreferencesService().getPreferences();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            Object l4 = r.l(preferences, anonymousClass1, this);
            xn.a aVar = xn.a.f37986a;
            if (l4 == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
