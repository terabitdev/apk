package io.elevenlabs.audio;

import android.media.AudioManager;
import g8.q0;
import io.livekit.android.audio.AudioFocusHandler;
import p.n;
import w7.d;
import z7.f0;
import z7.g0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13996b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f13995a = i10;
        this.f13996b = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        d dVar;
        switch (this.f13995a) {
            case 0:
                AudioSessionManager.a((AudioSessionManager) this.f13996b, i10);
                return;
            case 1:
                AudioFocusHandler.audioFocusListener$lambda$0((AudioFocusHandler) this.f13996b, i10);
                return;
            default:
                x7.b bVar = (x7.b) this.f13996b;
                bVar.getClass();
                if (i10 != -3 && i10 != -2) {
                    if (i10 != -1) {
                        if (i10 != 1) {
                            n.n(i10, "Unknown focus change type: ", "AudioFocusManager");
                            return;
                        }
                        bVar.b(2);
                        q0 q0Var = bVar.f37571c;
                        if (q0Var != null) {
                            g0 g0Var = q0Var.Z;
                            g0Var.getClass();
                            f0 b10 = g0.b();
                            b10.f39203a = g0Var.f39209a.obtainMessage(33, 1, 0);
                            b10.b();
                            return;
                        }
                        return;
                    }
                    q0 q0Var2 = bVar.f37571c;
                    if (q0Var2 != null) {
                        g0 g0Var2 = q0Var2.Z;
                        g0Var2.getClass();
                        f0 b11 = g0.b();
                        b11.f39203a = g0Var2.f39209a.obtainMessage(33, -1, 0);
                        b11.b();
                    }
                    bVar.a();
                    bVar.b(1);
                    return;
                }
                if (i10 != -2 && ((dVar = bVar.f37572d) == null || dVar.f36302a != 1)) {
                    bVar.b(4);
                    return;
                }
                q0 q0Var3 = bVar.f37571c;
                if (q0Var3 != null) {
                    g0 g0Var3 = q0Var3.Z;
                    g0Var3.getClass();
                    f0 b12 = g0.b();
                    b12.f39203a = g0Var3.f39209a.obtainMessage(33, 0, 0);
                    b12.b();
                }
                bVar.b(3);
                return;
        }
    }
}
