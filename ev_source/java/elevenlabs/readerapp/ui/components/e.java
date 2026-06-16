package io.elevenlabs.readerapp.ui.components;

import java.util.List;
import ta.v1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f14564b;

    public /* synthetic */ e(List list, int i10) {
        this.f14563a = i10;
        this.f14564b = list;
    }

    @Override // ho.a
    public final Object invoke() {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        int i10 = this.f14563a;
        List list = this.f14564b;
        switch (i10) {
            case 0:
                size = list.size();
                return Integer.valueOf(size);
            case 1:
                size2 = list.size();
                return Integer.valueOf(size2);
            case 2:
                size3 = list.size();
                return Integer.valueOf(size3);
            case 3:
                size4 = list.size();
                return Integer.valueOf(size4);
            case 4:
                return list;
            case 5:
                size5 = list.size();
                return Integer.valueOf(size5);
            case 6:
                ta.x xVar = ta.x.f32763g;
                return ta.l.a(ig.f.H(new v1(0, list)), 0, 0, ta.t.f32716d, null);
            default:
                Object obj = list.get(2);
                obj.getClass();
                return (Integer) obj;
        }
    }
}
