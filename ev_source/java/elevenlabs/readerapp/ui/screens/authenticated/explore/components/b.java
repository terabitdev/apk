package io.elevenlabs.readerapp.ui.screens.authenticated.explore.components;

import ho.p;
import java.util.Iterator;
import java.util.List;
import sn.k;
import sn.z;
import tn.o;
import u2.m;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f15414b;

    public /* synthetic */ b(List list, int i10) {
        this.f15413a = i10;
        this.f15414b = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c1  */
    @Override // ho.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        z Preview_ExploreFilterTopBar_ActiveFilters$lambda$0;
        Object obj3;
        k kVar;
        Object obj4;
        switch (this.f15413a) {
            case 0:
                Preview_ExploreFilterTopBar_ActiveFilters$lambda$0 = ExploreFilterTopBarKt.Preview_ExploreFilterTopBar_ActiveFilters$lambda$0(this.f15414b, (m) obj, ((Integer) obj2).intValue());
                return Preview_ExploreFilterTopBar_ActiveFilters$lambda$0;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                charSequence.getClass();
                List list = this.f15414b;
                if (list.size() == 1) {
                    String str = (String) o.V0(list);
                    int k02 = n.k0(charSequence, str, intValue, false, 4);
                    if (k02 >= 0) {
                        kVar = new k(Integer.valueOf(k02), str);
                        if (kVar == null) {
                            return null;
                        }
                        return new k(kVar.f31600a, Integer.valueOf(((String) kVar.f31601b).length()));
                    }
                    kVar = null;
                    if (kVar == null) {
                    }
                } else {
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    no.e eVar = new no.e(intValue, charSequence.length(), 1);
                    boolean z6 = charSequence instanceof String;
                    int i10 = eVar.f24558c;
                    int i11 = eVar.f24557b;
                    if (z6) {
                        if ((i10 > 0 && intValue <= i11) || (i10 < 0 && i11 <= intValue)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str2 = (String) obj4;
                                        if (str2.regionMatches(0, (String) charSequence, intValue, str2.length())) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    kVar = new k(Integer.valueOf(intValue), str3);
                                } else if (intValue != i11) {
                                    intValue += i10;
                                }
                            }
                            if (kVar == null) {
                            }
                        }
                        kVar = null;
                        if (kVar == null) {
                        }
                    } else {
                        if ((i10 > 0 && intValue <= i11) || (i10 < 0 && i11 <= intValue)) {
                            int i12 = intValue;
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str4 = (String) obj3;
                                        if (n.t0(str4, 0, charSequence, i12, str4.length(), false)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    kVar = new k(Integer.valueOf(i12), str5);
                                } else if (i12 != i11) {
                                    i12 += i10;
                                }
                            }
                        }
                        kVar = null;
                        if (kVar == null) {
                        }
                    }
                }
        }
    }
}
