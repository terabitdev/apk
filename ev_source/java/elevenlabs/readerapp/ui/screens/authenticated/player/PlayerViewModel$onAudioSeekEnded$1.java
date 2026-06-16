package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$onAudioSeekEnded$1", f = "PlayerViewModel.kt", l = {2689, 1654}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerViewModel$onAudioSeekEnded$1 extends yn.i implements ho.p {
    final /* synthetic */ double $cumulativeSeconds;
    double D$0;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$onAudioSeekEnded$1(PlayerViewModel playerViewModel, double d10, wn.c<? super PlayerViewModel$onAudioSeekEnded$1> cVar) {
        super(2, cVar);
        this.this$0 = playerViewModel;
        this.$cumulativeSeconds = d10;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PlayerViewModel$onAudioSeekEnded$1(this.this$0, this.$cumulativeSeconds, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerViewModel$onAudioSeekEnded$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // yn.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.label
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 0
            xn.a r5 = xn.a.f37986a
            if (r0 == 0) goto L35
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1c
            java.lang.Object r0 = r9.L$1
            io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel r0 = (io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel) r0
            java.lang.Object r1 = r9.L$0
            or.a r1 = (or.a) r1
            sn.a.g(r10)     // Catch: java.lang.Throwable -> L1a
            goto L67
        L1a:
            r10 = move-exception
            goto L82
        L1c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.google.protobuf.c6.x(r10)
            r10 = 0
            return r10
        L23:
            int r0 = r9.I$0
            double r6 = r9.D$0
            java.lang.Object r2 = r9.L$1
            io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel r2 = (io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel) r2
            java.lang.Object r8 = r9.L$0
            or.a r8 = (or.a) r8
            sn.a.g(r10)
            r10 = r0
            r0 = r2
            goto L55
        L35:
            sn.a.g(r10)
            io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel r10 = r9.this$0
            or.a r10 = io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel.access$getAudioSeekMutex$p(r10)
            io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel r0 = r9.this$0
            double r6 = r9.$cumulativeSeconds
            r9.L$0 = r10
            r9.L$1 = r0
            r9.D$0 = r6
            r9.I$0 = r3
            r9.label = r2
            java.lang.Object r2 = r10.a(r9)
            if (r2 != r5) goto L53
            goto L65
        L53:
            r8 = r10
            r10 = r3
        L55:
            r9.L$0 = r8     // Catch: java.lang.Throwable -> L80
            r9.L$1 = r0     // Catch: java.lang.Throwable -> L80
            r9.I$0 = r10     // Catch: java.lang.Throwable -> L80
            r9.I$1 = r3     // Catch: java.lang.Throwable -> L80
            r9.label = r1     // Catch: java.lang.Throwable -> L80
            java.lang.Object r10 = io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel.access$seekToCumulativePosition(r0, r6, r9)     // Catch: java.lang.Throwable -> L80
            if (r10 != r5) goto L66
        L65:
            return r5
        L66:
            r1 = r8
        L67:
            io.elevenlabs.domain.services.player.PlayerSeekEmitter r10 = io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel.access$getSeekEmitter$p(r0)     // Catch: java.lang.Throwable -> L7e
            r10.setIsSeeking(r3)     // Catch: java.lang.Throwable -> L7e
            io.elevenlabs.readerapp.ui.screens.authenticated.player.i1 r10 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.i1     // Catch: java.lang.Throwable -> L7e
            r2 = 15
            r10.<init>(r2)     // Catch: java.lang.Throwable -> L7e
            io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel.access$queueStateUpdate(r0, r10)     // Catch: java.lang.Throwable -> L7e
            r1.n(r4)
            sn.z r10 = sn.z.f31622a
            return r10
        L7e:
            r10 = move-exception
            goto L94
        L80:
            r10 = move-exception
            r1 = r8
        L82:
            io.elevenlabs.domain.services.player.PlayerSeekEmitter r2 = io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel.access$getSeekEmitter$p(r0)     // Catch: java.lang.Throwable -> L7e
            r2.setIsSeeking(r3)     // Catch: java.lang.Throwable -> L7e
            io.elevenlabs.readerapp.ui.screens.authenticated.player.i1 r2 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.i1     // Catch: java.lang.Throwable -> L7e
            r3 = 15
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7e
            io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel.access$queueStateUpdate(r0, r2)     // Catch: java.lang.Throwable -> L7e
            throw r10     // Catch: java.lang.Throwable -> L7e
        L94:
            r1.n(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$onAudioSeekEnded$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
