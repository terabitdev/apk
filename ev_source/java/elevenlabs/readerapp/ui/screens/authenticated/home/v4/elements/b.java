package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements;

import f4.e1;
import f4.g1;
import f4.h1;
import ho.q;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.ui.components.ReadAudioBackgroundImageKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import r1.s;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f15710b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15711c;

    public /* synthetic */ b(float f10, h5.c cVar) {
        this.f15709a = 1;
        this.f15711c = cVar;
        this.f15710b = f10;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z MediumCarouselItemV4_rAjV9yQ$lambda$0;
        z ReadAudioBackgroundImage$lambda$0$0;
        g1 scaleWidth$lambda$0;
        switch (this.f15709a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                MediumCarouselItemV4_rAjV9yQ$lambda$0 = HomeMediumCarouselSectionKt.MediumCarouselItemV4_rAjV9yQ$lambda$0(this.f15710b, (ExploreRead) this.f15711c, (s) obj, (m) obj2, intValue);
                return MediumCarouselItemV4_rAjV9yQ$lambda$0;
            case 1:
                int intValue2 = ((Integer) obj3).intValue();
                ReadAudioBackgroundImage$lambda$0$0 = ReadAudioBackgroundImageKt.ReadAudioBackgroundImage$lambda$0$0((h5.c) this.f15711c, this.f15710b, (xk.b) obj, (m) obj2, intValue2);
                return ReadAudioBackgroundImage$lambda$0$0;
            default:
                scaleWidth$lambda$0 = ComposeExtensionsKt.scaleWidth$lambda$0(this.f15710b, (i3.e) this.f15711c, (h1) obj, (e1) obj2, (h5.a) obj3);
                return scaleWidth$lambda$0;
        }
    }

    public /* synthetic */ b(float f10, Object obj, int i10) {
        this.f15709a = i10;
        this.f15710b = f10;
        this.f15711c = obj;
    }
}
