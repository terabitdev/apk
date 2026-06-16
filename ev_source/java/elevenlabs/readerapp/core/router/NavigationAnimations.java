package io.elevenlabs.readerapp.core.router;

import android.gov.nist.javax.sip.parser.TokenNames;
import i1.d1;
import i1.f1;
import i1.y0;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000f\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/readerapp/core/router/NavigationAnimations;", "", "<init>", "()V", "Li1/q;", "Lna/j;", "Li1/f1;", "animationSlideOutDown", "(Li1/q;)Li1/f1;", "Li1/d1;", "animationSlideInUp", "(Li1/q;)Li1/d1;", "animationSlideInRight", "animationSlideInLeft", "animationSlideOutRight", "animationSlideOutLeft", "", "enterAnimationDuration", TokenNames.I, "exitAnimationDuration", "animationFadeIn", "Li1/d1;", "getAnimationFadeIn", "()Li1/d1;", "animationFadeOut", "Li1/f1;", "getAnimationFadeOut", "()Li1/f1;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class NavigationAnimations {
    public static final int $stable = 0;
    public static final NavigationAnimations INSTANCE = new NavigationAnimations();
    private static final d1 animationFadeIn = y0.e(j1.e.s(300, 0, null, 6), 2);
    private static final f1 animationFadeOut = y0.f(j1.e.s(300, 0, null, 6), 2);
    public static final int enterAnimationDuration = 300;
    public static final int exitAnimationDuration = 300;

    private NavigationAnimations() {
    }

    public static final int animationSlideInLeft$lambda$0(int i10) {
        return i10 / 3;
    }

    public static final int animationSlideInRight$lambda$0(int i10) {
        return i10 / 3;
    }

    public static final int animationSlideInUp$lambda$0(int i10) {
        return i10 / 3;
    }

    public static final int animationSlideOutDown$lambda$0(int i10) {
        return i10 / 3;
    }

    public static final int animationSlideOutLeft$lambda$0(int i10) {
        return i10 / 3;
    }

    public static final int animationSlideOutRight$lambda$0(int i10) {
        return i10 / 3;
    }

    public final d1 animationSlideInLeft(i1.q qVar) {
        qVar.getClass();
        return ((i1.x) qVar).e(0, j1.e.s(300, 0, null, 6), new b0(4)).a(animationFadeIn);
    }

    public final d1 animationSlideInRight(i1.q qVar) {
        qVar.getClass();
        return ((i1.x) qVar).e(1, j1.e.s(300, 0, null, 6), new b0(5)).a(animationFadeIn);
    }

    public final d1 animationSlideInUp(i1.q qVar) {
        qVar.getClass();
        return ((i1.x) qVar).e(2, j1.e.s(300, 0, null, 6), new b0(3)).a(animationFadeIn);
    }

    public final f1 animationSlideOutDown(i1.q qVar) {
        qVar.getClass();
        return ((i1.x) qVar).f(3, j1.e.s(300, 0, null, 6), new b0(7)).a(animationFadeOut);
    }

    public final f1 animationSlideOutLeft(i1.q qVar) {
        qVar.getClass();
        return ((i1.x) qVar).f(0, j1.e.s(300, 0, null, 6), new b0(2)).a(animationFadeOut);
    }

    public final f1 animationSlideOutRight(i1.q qVar) {
        qVar.getClass();
        return ((i1.x) qVar).f(1, j1.e.s(300, 0, null, 6), new b0(6)).a(animationFadeOut);
    }

    public final d1 getAnimationFadeIn() {
        return animationFadeIn;
    }

    public final f1 getAnimationFadeOut() {
        return animationFadeOut;
    }
}
