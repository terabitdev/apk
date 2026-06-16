package com.google.gson.internal;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class Excluder implements com.google.gson.j, Cloneable {
    public static final Excluder l = new Excluder();

    /* renamed from: a, reason: collision with root package name */
    public final List f4232a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4233b;

    public Excluder() {
        List list = Collections.EMPTY_LIST;
        this.f4232a = list;
        this.f4233b = list;
    }

    @Override // com.google.gson.j
    public final com.google.gson.i a(final com.google.gson.b bVar, final TypeToken typeToken) {
        Class cls = typeToken.f4354a;
        final boolean b10 = b(cls, true);
        final boolean b11 = b(cls, false);
        if (!b10 && !b11) {
            return null;
        }
        return new com.google.gson.i() { // from class: com.google.gson.internal.Excluder.1

            /* renamed from: a, reason: collision with root package name */
            public volatile com.google.gson.i f4234a;

            @Override // com.google.gson.i
            public final Object b(w3.a aVar) {
                if (b11) {
                    aVar.N();
                    return null;
                }
                com.google.gson.i iVar = this.f4234a;
                if (iVar == null) {
                    iVar = bVar.d(Excluder.this, typeToken);
                    this.f4234a = iVar;
                }
                return iVar.b(aVar);
            }

            @Override // com.google.gson.i
            public final void c(w3.b bVar2, Object obj) {
                if (b10) {
                    bVar2.q();
                    return;
                }
                com.google.gson.i iVar = this.f4234a;
                if (iVar == null) {
                    iVar = bVar.d(Excluder.this, typeToken);
                    this.f4234a = iVar;
                }
                iVar.c(bVar2, obj);
            }
        };
    }

    public final boolean b(Class cls, boolean z10) {
        List list;
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            a.a aVar = v3.c.f10892a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        if (z10) {
            list = this.f4232a;
        } else {
            list = this.f4233b;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        a8.c.i();
        return false;
    }

    public final Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            f2.i.i(e10);
            return null;
        }
    }
}
