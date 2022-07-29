package com.example.cardiacrecorder;

import static org.junit.Assert.*;

import org.junit.Test;

public class forintentListTest
{
    private forintentList mockList()
    {
        forintentList mList=new forintentList();
        mList.add(mockMeasure());
        return mList;
    }
    private forintent mockMeasure()
    {
        return new forintent("22/07/2022","11:20pm",130,80,80,"healthy");
    }


    @Test
    public void testAdd()
    {
        forintentList mList=mockList();
        assertEquals(1,mList.getMeasure().size());

        forintent m=new forintent("23/07/2022","8:45pm",120,70,85,"Lively");
        mList.add(m);

        assertEquals(2,mList.getMeasure().size());
        assertTrue(mList.getMeasure().contains(m));
    }

    @Test
    public void testAddException()
    {
        forintentList mList=mockList();
        assertThrows(IllegalArgumentException.class,()->{
            mList.add(mockMeasure());
        });
    }



    @Test
    public void testGetMeasure()
    {
        forintentList mList = mockList();
        assertEquals(0, mockMeasure().compareTo(mockList().getMeasure().get(0)));

        forintent measure = new forintent("23/07/2022","8:45pm",120,70,85,"Lively");
        mList.add(measure);

        assertEquals(0, measure.compareTo(mList.getMeasure().get(1)));
        assertEquals(0, mockMeasure().compareTo(mList.getMeasure().get(0)));
    }

    @Test
    public void testRemove()
    {
        forintentList mList=mockList();
        forintent measure = new forintent("23/07/2022","8:45pm",120,70,85,"Lively");
        mList.add(measure);
        assertTrue(mList.getMeasure().contains(measure));
        mList.remove(measure);
        assertFalse(mList.getMeasure().contains(measure));

    }
    @Test
    public void testRemoveException()
    {
        forintentList mList=mockList();
        forintent measure = new forintent("23/07/2022","8:45pm",120,70,85,"Lively");
        assertThrows(IllegalArgumentException.class,()->{
            mList.remove(measure);
        });
    }

    @Test
    public void testEdit()
    {
        forintentList mList=mockList();
        forintent measure = new forintent("23/07/2022","8:45pm",120,70,85,"Lively");
        mList.add(measure);
        assertTrue(mList.getMeasure().contains(measure));
        forintent another=new forintent("28/07/2022","1:45am",110,90,95,"Fit");
        mList.edit(1,another);
        assertFalse(mList.getMeasure().contains(measure));
        assertTrue(mList.getMeasure().contains(another));
    }
}