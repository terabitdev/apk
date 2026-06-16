package io.elevenlabs.ui.components.animations;

import c3.k;
import com.google.firebase.analytics.FirebaseAnalytics;
import h5.j;
import ho.p;
import i1.e2;
import i1.g0;
import i1.g1;
import i1.y0;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.b;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.d;
import j1.e;
import j1.e1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006\u001a%\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0006\u001a%\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\n\u0010\u0006\u001a3\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "visible", "Lkotlin/Function0;", "Lsn/z;", FirebaseAnalytics.Param.CONTENT, "AnimatedSlideTopVisibility", "(ZLho/p;Lu2/m;I)V", "AnimatedSlideTopWithFadeVisibility", "AnimatedSlideDownWithFadeVisibility", "AnimatedFadeVisibility", "AnimatedSlideBottomVisibility", "onPostScroll", "Lkotlin/Function1;", "onVisibilityChanged", "Lb4/a;", "rememberUiVisibilityNestedScrollConnection", "(Lho/a;Lho/l;Lu2/m;II)Lb4/a;", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AnimatedVisibilityContainersKt {
    public static final void AnimatedFadeVisibility(boolean z6, p pVar, m mVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        pVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-201639487);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(pVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            z11 = z6;
            e2.c(z11, null, y0.e(null, 3), y0.f(null, 3), null, k.d(-766365543, true, new b(pVar, 5), qVar), qVar, (i11 & 14) | 200064, 18);
        } else {
            z11 = z6;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a(z11, pVar, i10, 0);
        }
    }

    public static final z AnimatedFadeVisibility$lambda$0(p pVar, g0 g0Var, m mVar, int i10) {
        g0Var.getClass();
        pVar.invoke(mVar, 0);
        return z.f31622a;
    }

    public static final z AnimatedFadeVisibility$lambda$1(boolean z6, p pVar, int i10, m mVar, int i11) {
        AnimatedFadeVisibility(z6, pVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void AnimatedSlideBottomVisibility(boolean z6, p pVar, m mVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        pVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1768537277);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(pVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            long j4 = 1;
            long j10 = (j4 << 32) | (j4 & 4294967295L);
            e1 r10 = e.r(u.P, 200.0f, 1, new j(j10));
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new d(18);
                qVar.h0(L);
            }
            i1.e1 a10 = y0.l((ho.l) L, r10).a(y0.e(null, 3));
            e1 r11 = e.r(u.P, 200.0f, 1, new j(j10));
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new d(19);
                qVar.h0(L2);
            }
            z11 = z6;
            e2.c(z11, null, a10, y0.o((ho.l) L2, r11).a(y0.f(null, 3)), null, k.d(312240491, true, new b(pVar, 2), qVar), qVar, (i11 & 14) | 196608, 18);
        } else {
            z11 = z6;
            qVar.R();
        }
        r1 r12 = qVar.r();
        if (r12 != null) {
            r12.f34012d = new a(z11, pVar, i10, 2);
        }
    }

    public static final z AnimatedSlideBottomVisibility$lambda$2(p pVar, g0 g0Var, m mVar, int i10) {
        g0Var.getClass();
        pVar.invoke(mVar, 0);
        return z.f31622a;
    }

    public static final z AnimatedSlideBottomVisibility$lambda$3(boolean z6, p pVar, int i10, m mVar, int i11) {
        AnimatedSlideBottomVisibility(z6, pVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void AnimatedSlideDownWithFadeVisibility(boolean z6, p pVar, m mVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        pVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-8255830);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(pVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            i1.e1 e10 = y0.e(null, 3);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new d(16);
                qVar.h0(L);
            }
            i1.e1 a10 = e10.a(y0.m((ho.l) L));
            g1 f10 = y0.f(null, 3);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new d(17);
                qVar.h0(L2);
            }
            z11 = z6;
            e2.c(z11, null, a10, f10.a(y0.p((ho.l) L2)), null, k.d(1338830546, true, new b(pVar, 1), qVar), qVar, (i11 & 14) | 200064, 18);
        } else {
            z11 = z6;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a(z11, pVar, i10, 1);
        }
    }

    public static final z AnimatedSlideDownWithFadeVisibility$lambda$2(p pVar, g0 g0Var, m mVar, int i10) {
        g0Var.getClass();
        pVar.invoke(mVar, 0);
        return z.f31622a;
    }

    public static final z AnimatedSlideDownWithFadeVisibility$lambda$3(boolean z6, p pVar, int i10, m mVar, int i11) {
        AnimatedSlideDownWithFadeVisibility(z6, pVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void AnimatedSlideTopVisibility(boolean z6, p pVar, m mVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        pVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1533190695);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(pVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new d(20);
                qVar.h0(L);
            }
            i1.e1 m10 = y0.m((ho.l) L);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new d(21);
                qVar.h0(L2);
            }
            z11 = z6;
            e2.c(z11, null, m10, y0.p((ho.l) L2), null, k.d(-26400591, true, new b(pVar, 3), qVar), qVar, (i11 & 14) | 200064, 18);
        } else {
            z11 = z6;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a(z11, pVar, i10, 3);
        }
    }

    public static final int AnimatedSlideTopVisibility$lambda$0$0(int i10) {
        return -i10;
    }

    public static final int AnimatedSlideTopVisibility$lambda$1$0(int i10) {
        return -i10;
    }

    public static final z AnimatedSlideTopVisibility$lambda$2(p pVar, g0 g0Var, m mVar, int i10) {
        g0Var.getClass();
        pVar.invoke(mVar, 0);
        return z.f31622a;
    }

    public static final z AnimatedSlideTopVisibility$lambda$3(boolean z6, p pVar, int i10, m mVar, int i11) {
        AnimatedSlideTopVisibility(z6, pVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void AnimatedSlideTopWithFadeVisibility(boolean z6, p pVar, m mVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        pVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(33680663);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(pVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            i1.e1 e10 = y0.e(null, 3);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new d(22);
                qVar.h0(L);
            }
            i1.e1 a10 = e10.a(y0.m((ho.l) L));
            g1 f10 = y0.f(null, 3);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new d(23);
                qVar.h0(L2);
            }
            z11 = z6;
            e2.c(z11, null, a10, f10.a(y0.p((ho.l) L2)), null, k.d(908419055, true, new b(pVar, 4), qVar), qVar, (i11 & 14) | 200064, 18);
        } else {
            z11 = z6;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a(z11, pVar, i10, 4);
        }
    }

    public static final int AnimatedSlideTopWithFadeVisibility$lambda$0$0(int i10) {
        return -i10;
    }

    public static final int AnimatedSlideTopWithFadeVisibility$lambda$1$0(int i10) {
        return -i10;
    }

    public static final z AnimatedSlideTopWithFadeVisibility$lambda$2(p pVar, g0 g0Var, m mVar, int i10) {
        g0Var.getClass();
        pVar.invoke(mVar, 0);
        return z.f31622a;
    }

    public static final z AnimatedSlideTopWithFadeVisibility$lambda$3(boolean z6, p pVar, int i10, m mVar, int i11) {
        AnimatedSlideTopWithFadeVisibility(z6, pVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final b4.a rememberUiVisibilityNestedScrollConnection(final ho.a aVar, final ho.l lVar, m mVar, int i10, int i11) {
        lVar.getClass();
        int i12 = i11 & 1;
        Object obj = l.f33918a;
        if (i12 != 0) {
            q qVar = (q) mVar;
            Object L = qVar.L();
            if (L == obj) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.d(17);
                qVar.h0(L);
            }
            aVar = (ho.a) L;
        }
        q qVar2 = (q) mVar;
        Object L2 = qVar2.L();
        if (L2 == obj) {
            L2 = new b4.a() { // from class: io.elevenlabs.ui.components.animations.AnimatedVisibilityContainersKt$rememberUiVisibilityNestedScrollConnection$2$1
                @Override // b4.a
                /* renamed from: onPostFling-RZ2iAVY */
                public /* bridge */ Object mo72onPostFlingRZ2iAVY(long j4, long j10, c<? super h5.q> cVar) {
                    return super.mo72onPostFlingRZ2iAVY(j4, j10, cVar);
                }

                @Override // b4.a
                /* renamed from: onPostScroll-DzOQY0M */
                public long mo73onPostScrollDzOQY0M(long consumed, long available, int source) {
                    if (Float.intBitsToFloat((int) (consumed & 4294967295L)) < -10.0f) {
                        ho.l.this.invoke(Boolean.FALSE);
                    }
                    aVar.invoke();
                    return 0L;
                }

                @Override // b4.a
                /* renamed from: onPreFling-QWom1Mo */
                public /* bridge */ Object mo74onPreFlingQWom1Mo(long j4, c<? super h5.q> cVar) {
                    return super.mo74onPreFlingQWom1Mo(j4, cVar);
                }

                @Override // b4.a
                /* renamed from: onPreScroll-OzD1aCk */
                public long mo75onPreScrollOzD1aCk(long available, int source) {
                    if (Float.intBitsToFloat((int) (available & 4294967295L)) > u.P) {
                        ho.l.this.invoke(Boolean.TRUE);
                        return 0L;
                    }
                    return 0L;
                }
            };
            qVar2.h0(L2);
        }
        return (AnimatedVisibilityContainersKt$rememberUiVisibilityNestedScrollConnection$2$1) L2;
    }

    public static final int AnimatedSlideBottomVisibility$lambda$0$0(int i10) {
        return i10;
    }

    public static final int AnimatedSlideBottomVisibility$lambda$1$0(int i10) {
        return i10;
    }

    public static final int AnimatedSlideDownWithFadeVisibility$lambda$0$0(int i10) {
        return i10;
    }

    public static final int AnimatedSlideDownWithFadeVisibility$lambda$1$0(int i10) {
        return i10;
    }
}
